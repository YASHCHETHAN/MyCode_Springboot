This code contains the Declartive approach with docker file(first-Job-declartive-approach-v1 refer this in jenkins) 

pipeline {
  agent any
  tools {
    maven "maven"
  }
  stages {
    stage("SCM checkout") {
      steps {
        checkout scmGit(branches: [
          [name: '*/JENKINS_DOCKER_V1']
        ], extensions: [], userRemoteConfigs: [
          [url: 'https://github.com/YASHCHETHAN/MyCode_Springboot.git']
        ])
      }
    }
    stage("Build Process") {
      steps {
        script {
          bat 'mvn clean install'
        }
      }
    }
    stage("Deploy to conatiner") {
      steps {
        deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'tomcat-pwd', path: '', url: 'http://localhost:10000/')], contextPath: 'Yashchethan', war: '**/*.war'
      }
    }
  }
  post {
  always {
    emailext(
      attachLog: true,
      body: '',
      mimeType: 'text/html',
      replyTo: '',
      subject: 'Build Notification for build number',
      to: '',
	   from: ''
    )
  }
}
}
