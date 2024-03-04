// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 script {
//                     sh 'mvn clean package'
//                 }
//             }
//         }
//     }
//     post {
//         success {
//             archiveArtifacts 'target/*.jar'
//         }
//     }
// }
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'javac CountdownTimer.java'
                }
            }
        }

        stage('Archive') {
            steps {
                script {
                    archiveArtifacts artifacts: 'CountdownTimer.class', fingerprint: true
                }
            }
        }
    }
}
