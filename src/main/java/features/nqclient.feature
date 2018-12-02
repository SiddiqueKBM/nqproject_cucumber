Feature: Client information
Scenario: Add a new client information
When enters 'Test Client 1' in 'Client' field
And enters 'TBGC01' in 'MullinTBG Code' field
And 'Active' check box is unchedcked
And enters 'Test Client 1 - Report Name' in 'Report Name' field
And enters <Tax ID> in 'Tax ID' field
And click the 'Unique ID' dropdown
Then the 'Unique ID' values and order in the list should be:
	|SSN			|
	|Employment ID	|
	|Participant ID	|
	|Other			|
When user selects the 2nd record from then 'Unique ID' dropdown list
And checks the 'Common ID' plan checkbox
And checks the 'Don 't Display Vested Balance on Plan Sponsor Site' checkbox is checked
And enters '125 13th Street' in 'Street Name' field
And enters '3101234567' in 'Phone number' field
And enters '3109999999' in 'Fax number' field
And enters 'El Segundo' in 'City Name' field
And enters 'CA' in 'State' field
And enters 'QE Team' in 'Contact' field
And enters '12345' in 'Zip' field
And enters 'USA' in 'Country' field
And enters 'nqtesting@prudential.com' in 'Email' field
And selects the 2nd record form the 'Consultant' droposown list
And selects the 10nd record form the 'FA Mgr' droposown list
And selects the 10nd record form the 'FA 1' droposown list
And selects the 10nd record form the 'CRM' droposown list
And selects the 10nd record form the 'FA 2' droposown list
And selects the 10nd record form the 'STL' droposown list
And selects the 10nd record form the 'Account Manage / Client Manager' droposown list
And selects the 10nd record form the 'Auditor 1' droposown list
And selects the 10nd record form the 'Auditor 2' droposown list
And selects the 10nd record form the 'Invesment Analist' droposown list
And checks the 'Do Not Allow Additions noor Edits to particiipant Bank Info form' checkbox
And selects the 1st record in 'SSO Unique ID' dropdown list
And enters 'SSO Home Page' in 'SSO Home Page label' field
And enters 'SSO Contact Us' in 'SSO contact US label' field
And enters 'PSS Home Page' in 'PSS Homepage label' field
And click save button
Then the new Client ID should be displayed in the window title bar with 'Client Information - {client id} [VIEW]'
And the client window is in View mode with the same selected information during add mode

