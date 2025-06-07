Feature: TutorialPoint

  #REQ-C1
  Scenario: Checkbox zakladni zaskrtavani
    Given Uzivatel je na strance tutorialpoint checkbox
    When Uzivatel zaklikne checkbox s id "c_bs_1"
    Then Uzivatel vidi zaskrtnuty checkbox s id "c_bs_1"

