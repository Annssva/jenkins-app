pipeline {
    agent any
    stages {
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
