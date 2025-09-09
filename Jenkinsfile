pipeline {
  agent any
  tools {
    maven "maven"
  }
  stages {
    stage("SCM checkout") {
      steps {
        checkout scmGit(branches: [
          [name: '*/JENKINS_DOCKER_V2']
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
    stage("Docker Image") {
      steps {
        script {
          bat 'docker build -t yashchethandocker/yashchethan:v2 .'
        }
      }
    }
    stage("Push Docker Image to Repo") {
      steps {
         withCredentials([string(credentialsId: 'DOCKER_CRED', variable: 'DOCKER_CRED')]) {
           bat 'docker login -u yashchethandocker -p ${DOCKER_CRED}'
           bat 'docker push yashchethandocker/yashchethan:v2'
        }
      }
    }         
  }
  post {
  always {
    emailext(
      attachLog: true,
          body: ''' <html>
                        <body>
                            <p>Build Status: ${BUILD_STATUS}</p>
                            <p>Build Number: ${BUILD_NUMBER}</p>
                            <p>Check the <a href="${BUILD_URL}">console output</a>.</p>
                        </body>
                      </html>''', 
      mimeType: 'text/html',
      replyTo: 'cgowdahs697@gmail.com',
      subject: 'Build Notification for build number',
      to: 'cgowdahs697@gmail.com',
	  from: 'cgowdahs697@gmail'
    )
  }
}
}