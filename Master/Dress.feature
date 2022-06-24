

Feature: End to end on Dress page
  

  @tag1
  Scenario: Validate the Dress page
    Given launch the Dress page and validate the all elements
    When Click the sortby dropdown in Dress page and select lowest_first
    Then verify the lowest value should be selected in Dress page
    
    @tag3 
    Scenario: Validation on Evening page
    Given Evening dress page should be validated succesfully
    When  Click the Evening page 
    Then Verify the title of the page 
   

  
