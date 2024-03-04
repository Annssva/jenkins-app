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
                    sh 'jar cfe CountdownTimer.jar CountdownTimer CountdownTimer.class'
                }
            }
        }

        stage('Archive') {
            steps {
                script {
                    archiveArtifacts artifacts: 'CountdownTimer.jar', fingerprint: true
                }
            }
        }
    }
}

