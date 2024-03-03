pipeline {
    agent any
    // tools {
    //     maven 'Maven'
    // }
    stages {
        // stage('Checkout') {
        //     steps {
        //         script {
        //             git branch: 'master', url: 'https://github.com/Annssva/jenkins-java-app.git'
        //         }
        //     }
        // }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.jar'
        }
    }
}
