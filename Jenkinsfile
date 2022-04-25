pipeline {
	agent any
	  stages {     	  
	    /**stage('Checkout') { 
	    	steps {
	    		git branch: 'master', 
	            url: 'git@github.com:MichaelKim2000/Calculator.git'    
	    	}	    	        
	    }**/
	    
	    stage('Build') {
	    	steps {
    			sh "mvn clean package"	    	        
	    	}
		}     	    
		
		stage('Test') {
			steps {
    			//junit '**/target/surefire-reports/*.xml'  
				archiveArtifacts 'target/*.jar'			        
			}	    		    		    
		}
    }
    post {   
    	always {
    		echo 'in post'         
    	}
    			   					    
	    regression  {
		    echo "to: regression@email.com"
		    echo "subject: Job '${JOB_NAME}' (${BUILD_NUMBER}) is facing regression with Status ${currentBuild.result}"
		    echo "bode: Please go to ${BUILD_URL} and verify the build"		    	
	  	}
	  	
	  	fixed {
	  		echo "fixed@email.com"
		    echo "subject: Job '${JOB_NAME}' (${BUILD_NUMBER}) has been fixed"
		    echo "body: Please go to ${BUILD_URL} and verify the build"		  	    
	  	}			  
	}
    
}