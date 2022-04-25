node {  
    stage('Checkout') { 
        git branch: 'master', 
            url: 'git@github.com:MichaelKim2000/Calculator.git'
    }
    
    stage('Build') {	    
	    sh "mvn clean package"
	    
	}     	    
      	
    stage('Results') {
        junit '**/target/surefire-reports/*.xml'
        archiveArtifacts 'target/*.jar'
    }    
}