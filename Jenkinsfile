pipeline {
    agent any

    tools {
        // Déclare Maven et JDK à utiliser
        maven 'M3' // Assure-toi que Maven est installé sur Jenkins et nommé "M3" dans la configuration des outils
        jdk 'JDK11' // Choisis la version du JDK qui correspond à ton projet
    }

    environment {
        // Déclare des variables d'environnement si nécessaire
        // Par exemple, pour un serveur distant pour déployer l'application
        // DEPLOY_SERVER = 'myserver.com'
    }

    stages {
        stage('Checkout') {
            steps {
                // Récupère les dernières modifications du dépôt Git
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // Compile le projet avec Maven
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Exécute les tests unitaires avec Maven
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Déployer si les tests réussissent, par exemple, sur un serveur
                    // Exemples :
                    // sh 'scp target/mon-application.jar user@${DEPLOY_SERVER}:/path/to/deploy'
                    // ou pour un autre type de déploiement
                    echo 'Déploiement effectué.'
                }
            }
        }
    }

    post {
        success {
            // Actions après un build réussi
            echo 'Build et tests réussis.'
        }
        failure {
            // Actions après un build échoué
            echo 'Une erreur est survenue.'
        }
    }
}
