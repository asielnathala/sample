pipeline {
    agent any

    tools {
        jdk 'JDK25'      // must be configured in Jenkins
        maven 'apache-maven-3.9.14'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/asielnathala/sample.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                script {
                    sh 'docker --version'
                    sh 'docker build -t hello-java25:latest .'
                }
            }
        }
        stage('Run') {
            steps {
                sh 'java -cp target/hello-java25-1.0-SNAPSHOT.jar com.example.App'
            }
        }
    }
}
