Feature: SupplySuit
  @wip
  Scenario: Main Page
    When Go to the "Netherlands_URL"
    #When Go to SuitSupply page
    Then Scroll Down the page to Custom suits
    And Click on Custom suits
    And Scroll Down the page to Custom Made Coat
    And Close cookies window
    And Click on Start Now
    And Close message
    #1.Fabric
    And Select "White"
    And Close Search box
    And Click to Filter
    And Click to checkboxes
    And Click to Next Button
    #2.Style
    And Click Fit Box
    And Select fit
    And Click to Apply
    And Click to Side Pocket Box
    And Select Pocket Type
    And Click to Apply
    And Click to Weistline Box
    And Select Weistline Type
    And Click to Apply
    And Click to Lenght Box
    And Select Length Type
    And Click to Apply
    And Click to Lining Box
    And Select Lining Type "Paisley Purple"
    And Click to Apply
    And Click to Buttons Box
    And Select the Button Type
    And Click to Apply
    And Click to Next Button
    #3.Size
    When Click to Get Start to create the size
    And Click to Select Size
    #Size 42/44/46/48/50/52/54/56
    And Select "48" Size
    And Click to Select Size Button
    And Change the scale size cm to inch and cm
    And Click to Chest Width to How to measure Chest width
    And Edit your selection and Apply
    And Click to Waist Width to How to measure Waist Width
    And Edit your selection and Apply
    And Click to Sleeve Length Left to How to measure it
    And Edit your selection and Apply
    And Click to Sleeve Length Right to How to measure it
    And Edit your selection and Apply
    And Click to Coat Length to How to measure it
    And Edit your selection and Apply
    And Click to Save & Continue Button
    And Enter Your profile name "My Coat" in the profile box
    #4. Summary
    Then Verify "My Coat" is displayed at next Summary Page your selections
    And Click to Add Button
