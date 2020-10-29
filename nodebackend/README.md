    GCloud installation
        1. Prepare a docker image for google cloud
            gcr.io/domshom-web-273102/my-node-app:v1
        1a. Push to docker image to container registry
        2. Create a cluster (kubernetes)
            cluster-1
        3. Deploy the image to the cluster
        kubectl create deployment my-node-app --image=gcr.io/${PROJECT_ID}/my-node-app:v1
        4. Expose the deployment through a load balancer
        kubectl expose deployment my-node-app --type=LoadBalancer --port 80 --target-port 3000