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
    
    
    post {          

	    regression  {
		    mail to: 'regression@email.com',
		    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is facing regression",
		    body: "Please go to ${BUILD_URL} and verify the build"
	    	
	  	}
	  	
	  	fixed {
	  		mail to: 'fixed@email.com',
		    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) has been fixed",
		    body: "Please go to ${BUILD_URL} and verify the build"
	  	    
	  	}

    }
}