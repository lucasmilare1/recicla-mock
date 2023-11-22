name: GCP
on:
  push:
    branches: [main]
jobs:
  deploy:
    name: Setup Gcloud Account
    runs-on: ubuntu-latest
    environment: mock-prod
    env:
      IMAGE_NAME: gcp.io/${{ secrets.GCP_PROJECT_ID }}/mock:latest
    steps:

      - name: Checkout
        uses: actions/checkout@v2

      - uses: google-github-actions/setup-gcloud@v0.2.0
        with:
          service_account_key: ${{ secrets.GCP_CREDENTIALS }}
          project_id: ${{ secrets.GCP_PROJECT_ID }}

      - name: Configure Docker
        run: gcloud auth configure-docker --quiet

      - name: Build Docker image
        run: docker build -t $IMAGE_NAME .

      - name: Push Docker image
        run: Docker push $IMAGE_NAME

      - name: Push Docker Image
        run: gcloud run deploy mock --image $IMAGE_NAME --region us-central1 --memory 128Mi --min-instances 1 --plataform managed --port 80 --allow-unauthenticated