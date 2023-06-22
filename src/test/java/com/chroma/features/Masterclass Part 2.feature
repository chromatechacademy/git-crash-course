Feature: Masterclass Part 2

  @Masterclass
  Scenario: Verifying paragraphs
    Given user is on the Request SEER Incidence Data home page
    Then About Non-Institutional Accounts text displays
      """
      To request access to the SEER Incidence Databases, you will need to register through either the Institutional or Non-Institutional Account option.
      
      About Institutional Accounts
      If you are affiliated with a Company, Hospital, Research Institution, or University and have an institutional email account (.edu, .gov, .org, or work email address), you must use eRA Commons credentials to request the SEER data through the Institutional Account option below.
      Exceptions applied to federal government agencies: Requestors associated with the NIH, or the following other HHS Agencies should use their PIV Cards to request an Institutional Account: AHRQ, CDC, CMS, FDA, and IHS.
      Information on how to obtain an eRA commons login can be found in the FAQ on the SEER webpage.
      Users who register using their Institutional Accounts will receive access to the SEER Research Plus Databases, and be eligible to request specialized databases.
      
      About Non-Institutional Accounts
      If you do not plan to request specialized datasets or use the SEER Research Data in affiliation with an institution, you can register for a Non-Institutional Account. You should use a personal email address and leave the organization field blank.
      A Non-Institutional Account holder can upgrade their access to include the Research Plus Database using their registered email address and once again go the Non-Institutional route below.
      """
