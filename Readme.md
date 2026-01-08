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

## TP2 - Execution Docker Compose

### Lancer les services

```bash
docker compose up --build
```

### Tester

```bash
curl http://localhost:8080/customer/Jean%20Dupont
```

URL dans le navigateur : http://localhost:8080/customer/Jean%20Dupont

Resultat attendu :
```
Bonjour Jean Dupont (service PHP -> Matthieu)
```

### Arreter les services

```bash
docker compose down
```
