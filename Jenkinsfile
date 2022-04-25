node {  
    stage('Checkout') { 
        git branch: 'master', 
            url: 'git@github.com:MichaelKim2000/Calculator.git'
    }
    
    stage('Build') {	    
	    sh "mvn clean package"
	    
	}     	    

      	
    stage('JUnit') {
        junit '**/target/surefire-reports/*.xml'      
    }    

      	
    stage('Archive Jar') {        
        archiveArtifacts 'target/*.jar'
    }    
}