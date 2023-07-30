pipeline {
    agent any

    tools {
        maven 'maven 3.8.7' 
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/houcinehlali/hlalijenkins.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn verify'
            }
        }
    }

    post {
        always {
            // Archiver le fichier JSON du rapport
            archiveArtifacts artifacts: "json:target/cucumber-reports.json"

            // Archiver le fichier html du rapport
            archiveArtifacts artifacts: "html:target/cucumber-reports.html"
            // Envoyer l'email avec les rapports en pi�ces jointes
            emailext (
                to: 'hlalihoucine@gmail.com', // Remplacez par l'adresse email du destinataire
                subject: 'Rapport de test Cucumber',
                body: 'Bonjour,\nVeuillez trouver ci-joint les rapports g�n�r�s par Cucumber.',
                attachmentsPattern: 'target/cucumber-html-reports/cucumber.html,target/cucumber.json'
            )
        }
    }
}