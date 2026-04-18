pipeline {
    agent any

    tools {
        jdk 'JDK25'      // must be configured in Jenkins
        maven 'maven v3.9.14'
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

        stage('Run') {
            steps {
                sh 'java -cp target/hello-java25-1.0-SNAPSHOT.jar com.example.App'
            }
        }
    }
}
