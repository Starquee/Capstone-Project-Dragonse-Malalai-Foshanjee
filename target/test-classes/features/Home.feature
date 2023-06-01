@Regression
Feature: Retail Home Page

  Background:  
        Given User is on retail website
        When User click on All section


  @ShopByDepartment @Regression
  Scenario: Verify Shop by Department sidebar
    
        Then below options are present in Shop by Department sidebar
          | Electronics | Computers | Smart Home | Sports | Automative |


  @DepartmentSideBar @Regression
  Scenario Outline: Verify department sidebar options
    And User can see below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |
