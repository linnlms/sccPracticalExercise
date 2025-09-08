pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/linnlms/sccPracticalExercise.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Docker Build & Push') {
            steps {
                sh 'docker build -t my-java-app .'
            }
        }
    }
}
