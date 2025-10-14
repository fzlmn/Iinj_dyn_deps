# Injection Dynamique des Dépendances — Java / Spring

##  Objectif du TP

Ce projet a pour but de **comparer trois approches différentes** d’injection de dépendances (Dependency Injection) en Java.  
L’objectif est de comprendre comment passer d’un couplage fort à un **couplage faible**, et d’observer l’évolution entre une injection manuelle et une injection automatisée avec Spring.

---

##  Structure du projet


<img width="356" height="769" alt="image" src="https://github.com/user-attachments/assets/86603794-1375-4c06-bc0c-a389ef0bbfab" />

**Figure 1 — Structure du projet dans IntelliJ IDEA**

##  Partie 1 — Injection dynamique avec un fichier texte (config.txt)

Classe principale : pres.Pres1
Fichier de configuration : config.txt

###  Description

Le programme lit le contenu du fichier config.txt.

Il charge dynamiquement les classes indiquées (DAO et Metier) à l’aide de la réflexion.

L’injection de dépendance se fait manuellement grâce à la méthode setDao().

<img width="435" height="100" alt="image" src="https://github.com/user-attachments/assets/8aed286d-dcd4-4a66-b79c-9507ac01d7dc" />

**Figure 2 — Contenu du fichier config.txt**

**Sortie attendue :**

Version Web Service
Résultat : 97.2

<img width="555" height="237" alt="image" src="https://github.com/user-attachments/assets/80e88eee-709c-496b-b519-a0e5fc8fb60d" />

**Figure 3 — Résultat de l’exécution de Pres1 (injection manuelle)**

##  Partie 2 — Injection avec Spring (fichier XML)

Classe principale : pres.Pres2_spring
Fichier de configuration : config.xml

###  Description

Spring se charge de créer les objets à partir du fichier XML.

L’injection se fait automatiquement grâce à la balise <property>.

Plus besoin de lire le fichier ou d’utiliser la réflexion.

**Fichier config.xml :**

<img width="985" height="442" alt="image" src="https://github.com/user-attachments/assets/0bd4c0bf-a306-4fbf-9176-eb83bdb6cdf3" />


**Figure 4 — Contenu du fichier config.xml**

**Sortie attendue :**

Version Web Service
Résultat : 97.2

<img width="800" height="190" alt="image" src="https://github.com/user-attachments/assets/89877316-a707-413a-9aaf-8972810992a8" />

**Figure 5 — Résultat de l’exécution avec Spring et configuration XML**

##  Partie 3 — Injection avec annotations

Classe principale : pres.Pres3_annotation

###  Description

Utilisation de Spring avec annotations :

@Component pour déclarer les classes comme beans.

@Autowired pour l’injection automatique du DAO dans la classe métier.

Spring scanne les packages ext et metier pour détecter les composants.

**Sortie attendue :**

Version BD
Résultat : 330.48

<img width="928" height="755" alt="image" src="https://github.com/user-attachments/assets/64ff8440-11d7-42fd-8943-e4e758fff6b8" />

**Figure 6 — Exemple de classes annotées avec @Component et @Autowired**

<img width="759" height="179" alt="image" src="https://github.com/user-attachments/assets/c45fb05d-75a8-4dd1-b24c-7c568851cb63" />

**Figure 7 — Résultat de l’exécution avec annotations**

<img width="1036" height="816" alt="image" src="https://github.com/user-attachments/assets/191348dd-f804-4a92-af3d-a560e99375b9" />

