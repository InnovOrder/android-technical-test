# Test technique pour Innovorder

Ce répertoire contient la base d’une application Android que tu pourras compléter pour obtenir les résultats proposés.

L’idée principale est d’avoir une base de discussion pour le premier entretien : nous pourrons discuter ensemble du code que tu auras écrit, des choix techniques que tu auras faits, de ce qui peut être amélioré... Pas d’inquiétude donc, l’idée n’est pas d’arriver à un résultat parfait, nous savons que ce sujet s’adresse à des candidats ayant peu d’expérience sur Android.

## Objectifs

1. Comprendre le code déjà existant.
2. N’hésite pas à appliquer les modifications qui te sembleront judicieuses. Le code est volontairement imparfait, l’architecture ne respecte pas forcément les bonnes pratiques recommandées par Google. Toute amélioration de ta part sera la bienvenue.
   Si tu manques de temps pour les appliquer, tu peux aussi complémenter la submission de ton projet d’un document texte dans lequel tu peux décrire les problèmes que tu as remarqués, et éventuellement des propositions de résolution de ces problèmes.
3. Implémenter de nouvelles fonctionnalités, qui seront décrites dans la section suivante.

### Objectifs bonus (non obligatoires) :

- Tout ajout de tests (unitaires et/ou instrumentés) sera le bienvenu
- Si tu as des idées de fonctionnalités et du temps pour le faire, tu peux laisser libre cours à ton imagination

L’idée n’est pas de te faire passer des heures sur ce projet. Si jamais tu as des questions à propos du sujet du test, si tu le trouves trop long, ou que tu ne sais pas par où commencer, n’hésite pas à nous contacter par mail.

## Ce que fait l’app avant ton travail

Lorsque l’application est lancée, elle fait une requête sur un serveur distant pour récupérer une liste d’éléments (des canards 🦆) et les afficher à l’écran.

## Fonctionnalités à développer

1. Tu remarqueras probablement que l’app crash au lancement. Ta première tâche sera de comprendre pourquoi et de résoudre ce problème.
   *Rappel: si cela commence à prendre trop de temps, n’hésite pas à nous contacter. Nous préférons te donner la direction qui te permettra de te débloquer pour que tu puisses continuer sur les autres étapes*
2. Une fois cette première étape résolue, tu devrais voir une liste d’éléments s’afficher à l’écran. Nous te proposons de rajouter la fonctionnalité suivante : au clic sur un élément, afficher le détail de cet élément. Nous n’avons pas d’attente particulière quant au design de ce nouvel écran, mais il devra permettre d’afficher toutes les informations disponibles de l’élément pressé.
3. Tu remarqueras un bouton “Kwak” en bas de l’écran principal. Nous aimerions que son texte corresponde à la couleur majoritaire dans la liste des canards. (Par exemple : s’il y a 5 canards jaunes et 2 canards noirs, le texte du bouton “Kwak” doit être remplacé par "jaune").
4. Comme dit dans la section “Objectifs”, tu peux faire des améliorations d’architectures si tu en as le temps. Cela peut concerner par exemple une meilleure séparation des responsabilités des classes, meilleure organisation des fichiers du projet, des refactos sur des parties de code mal conçues, des tests, des améliorations diverses que tu aurais envie de mettre en place...

## Soumettre ton projet

Nous te proposons deux options pour soumettre ton projet :

- une archive (zip par exemple) contenant le projet, que tu peux nous envoyer par mail.
- un repo Git si tu souhaites l’héberger sur un service tel que GitHub, GitLab, FramaGit... Dans ce cas, nous te recommandons de créer un repository privé et de donner les doits à l’utilisateur `android@innovorder.fr`

Comme indiqué dans la section “Objectifs”, tu peux si tu le souhaites nous faire part des idées d’amélioration que tu avais mais que tu n’as pas eu le temps de mettre en place.

# Étape suivante

Après avoir reçu ton projet, nous nous engageons à l’examiner dans un délai d’une semaine maximum et de te faire un premier retour dessus. Si tu as rempli tous les objectifs obligatoires, nous te proposerons un premier entretien qui sera l’occasion de discuter ensemble de ton projet et de tes connaissances techniques (Android, mais pas uniquement : si tu as d’autres connaissances, tu pourras nous en parler).

À toi de jouer, et, de nouveau, n’hésite pas à nous contacter en cas de difficulté pour réaliser cet exercice !
