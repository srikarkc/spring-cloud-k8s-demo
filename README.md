# Demo application using spring-cloud-starter-kubernetes

## Tested to work on Minikube on Dec' 12, 2024

Ensure that you apply the role and role binding before deploying the application.

Also to test the endpoint from Minikube, need to port-forward or use tunneling.

`kubectl port-forward service/user-service 8080:80`
