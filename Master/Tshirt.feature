

Feature: End to end on tshirt
  

  @tag1
  Scenario: Validate the  tshirt page
    Given launch the tshirt page and validate the all elements
    When Click the sortby and select lowest_first
    Then verify the lowest value should be selected
   

  
