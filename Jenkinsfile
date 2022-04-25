node {  
    stage('Checkout') { 
        git branch: 'master', 
            url: 'git@github.com:MichaelKim2000/Calculator.git'
    }
    
    stage('Build') {	    
	    sh "mvn clean package"
	    
	}     	    
     	 
        
    post {          
		always {
			junit '**/target/surefire-reports/*.xml'  
			archiveArtifacts 'target/*.jar'
		}	   				
	    
	    regression  {
		    echo "to: regression@email.com"
		    echo "subject: Job '${JOB_NAME}' (${BUILD_NUMBER}) is facing regression for ${currentBuild.result}"
		    echo "bode: Please go to ${BUILD_URL} and verify the build"		    	
	  	}
	  	
	  	fixed {
	  		echo "fixed@email.com"
		    echo "subject: Job '${JOB_NAME}' (${BUILD_NUMBER}) has been fixed"
		    echo "body: Please go to ${BUILD_URL} and verify the build"
	  	    
	  	}
		  
    }
}