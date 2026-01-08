# TP2 - Conteneurisation avec Docker

## TP2 - Image Docker PHP

Image Docker Hub : `matthkernel/customer-service:tp2`

### Commandes

```bash
# Pull de l'image
docker pull matthkernel/customer-service:tp2

# Lancer le conteneur
docker run --rm -p 8081:80 matthkernel/customer-service:tp2

# Tester
curl http://localhost:8081/
```
