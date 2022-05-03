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
		
		
		stage('Quality') {
			steps {
				// do some Sonarqube 
				echo 'Dummy: Sonarqube'						        
			}	    		    		    
		}
		
		stage('Functional Test') {
			steps {
				// do some Selenium 
				echo 'Dummy: Selenium'						        
			}	    		    		    
		}
		
		stage('Docker Build') {
			steps {
				// do some Docker 
				//build("calc")
				echo 'Dummy: Docker'						        
			}	    		    		    
		}
		
    }
    post {   
    	always {    				        		
    		echo 'in post'     
    		junit '**/target/surefire-reports/*.xml'  
			archiveArtifacts 'target/*.jar'					    
    	}
    			   					    
	    regression  {
    	   	emailext to: "regression@email.com",
    			subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is facing regression with Status: ${currentBuild.result}", 
    			body: "Please go to ${BUILD_URL} and verify the build"  		    			 	    			    		    		    	
	  	}
	  	
	  	fixed {
	  		emailext to: "fixed@email.com",
			    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) has been fixed",
			    body: "Please go to ${BUILD_URL} and be happy"  	    	  		
	  	}		
	  	
	  	failure {
	  		emailext to: "failure@email.com",
			    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) with Status: ${currentBuild.result}",
			    body: "Please go to ${BUILD_URL} and be happy"  	    	  		
	  	}			  
	}    
}