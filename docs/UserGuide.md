---
layout: page
title: User Guide
---

# ClientBook

ClientBook is an application for insurance agents to manage client contacts, optimized for use with just a keyboard,
but still offering a graphical interface for ease of viewing of client contacts. The purpose of ClientBook is to help 
insurance agents who can type fast to accomplish their client management tasks faster than traditional applications.
If this is the first time that you are using an application like ClientBook, you do not have to worry. We have included
a section [here](#how-to-use-this-user-guide) to guide you through this user guide.

## Why ClientBook?

ClientBook is designed for insurance agents who are always on the go. We understand the pain and inconvenience of having to navigate around
your screen without a mouse while you are out meeting a client. We are also aware that you might have to remember various details about your many clients.
<br>

Thus, ClientBook is born!<br>

Requiring **minimal interactions with your cursor**, ClientBook still allows you to complete essential contact management
tasks with our minimal yet essential set of contact management features.<br>


## Purpose of This User Guide

The purpose of this user guide is to help you, the user get started with using ClientBook as well as to help you to get familiarised
with the features that it has to offer so that you can become comfortable with using it in your day-to-day operations as an insurance agent.

## How to Use This User Guide
If you are a new user, you can start with the [Quick Start](#quick-start) section to get ClientBook running. After that,
we have also provided an [Example Usage](#example-usage) section to help you get familiarised with ClientBook.
If you are an experienced user, we have provided a convenient [Summary of Commands](#summary-of-commands) at the end of this user guide.

## Table of Contents 

Please use the table of contents to navigate through the user guide quickly. ClientBook's commands are grouped into 
<span style="color:#b573c9">**contact management**</span>, 
<span style="color:#f75c66">**contact viewing**</span>, and 
<span style="color:#3cb44b">**general**</span> commands.



* [**1.** Quick Start](#quick-start)
* [**2.** Example Usage](#example-usage)
* [**3.** Overview](#overview)
  * [**3.1** Feature Summary](#feature-summary)
  * [**3.2** What information can we store for each client contact?](#what-information-can-we-store-for-each-client-contact)
* [**4.** Feature Description](#feature-description)
  * [**4.1** `help`: Viewing help](#help-viewing-help)
  * [**4.2** `add`: Add client contact](#add-add-client-contact)
  * [**4.3** `edit`: Edit client contact](#edit-edit-client-contact)
  * [**4.4** `list`: List all clients](#list-list-all-clients)
  * [**4.5** `find`: Search for client contact based on keywords](#find-search-for-client-contact-based-on-keywords)
  * [**4.6** `policy`: Display policies associated with a client](#policy-display-policies-associated-with-a-client)
  * [**4.7** `delete`Delete client contact](#delete-delete-client-contact)
  * [**4.8** `batch` Execute commands in batch](#batch-execute-commands-in-batch)
  * [**4.9** `sort`: Sort list of clients](#sort-sort-list-of-clients)
  * [**4.10** `meet`: Schedule a meeting with a client](#meet-schedule-a-meeting-with-a-client)
  * [**4.11** `addshortcut`: Add shortcut](#addshortcut-add-shortcut)
  * [**4.12** `editshortcut`: Edit shortcut](#editshortcut-edit-shortcut)
  * [**4.13** `deleteshortcut`: Delete shortcut](#deleteshortcut-delete-shortcut)
  * [**4.14** `listshortcut`: List all shortcuts](#listshortcut-list-all-shortcuts)
  * [**4.15** `clearshortcut`: Clear all shortcuts](#clearshortcut-clear-all-shortcuts)
  * [**4.16** `lock`: Lock ClientBook with a user-selected password](#lock-lock-clientbook-with-a-user-selected-password)
  * [**4.17** `unlock`: Unlock ClientBook](#unlock-unlock-clientbook)
  * [**4.18** `exit`: Exiting the program](#exit-exiting-the-program)
  * [**4.19** Saving data](#saving-data)
  * [**4.20** Editing data file](#editing-data-file)
  * [**4.21** Upcoming features!](#upcoming-features-v20-and-beyond)
* [**5.** Frequently Asked Questions](#frequently-asked-questions)
  * [**5.1** Setting Up](#setting-up)
* [**6.** Summary of Commands](#summary-of-commands)
* [**7.** Glossary](#glossary)
* [**8.** Contact Us](#contact-us)


## Quick Start

The quick start section provides a tutorial which will guide you through the steps needed to get ClientBook running.

<br>

1. Ensure you have Java `11` or above installed in your Computer.
   * To check if you have this installed or for instructions on how to install, refer to our FAQ [here](#frequently-asked-questions).


1. Download the latest `clientbook.jar` [here](https://github.com/AY2021S2-CS2103T-W15-2/tp/releases/tag/v1.2).
   

1. Copy the file to the folder (we will be referring to this folder as the _home folder_) where you want to store the ClientBook application and your client information.


1. Double-click the downloaded `clientbook.jar` file in your home folder to start the app. The screen below should appear in a few seconds. 
   * Alternatively, for those who are tech-savvy, you can launch the application via Command Prompt in Windows or Terminal in Mac OS/Linux using the following command: `java -jar clientbook.jar`. 
   * Note how the app contains some sample data.
    
        <p align="center"><img src="images/Ui-annotate.png"></p>
        <p align="center">Graphical user interface of ClientBook.</p>
    
1. Type the command in the command box and press Enter to execute it.
   * Some example commands you can try:

   | Command | Purpose |
   | ----------- | ----------- |
   | `help` | Opens the help window with a URL to this User Guide |
   | `list` | Lists all contacts |
   | `add n/John Doe p/98765432 e/johnd@example.com a/Orchard Street, Block 123, #01-01 i/Policy_1022` | Adds a client named `John Doe` and his information to the ClientBook |
   | `delete 3` | Deletes the 3rd contact in the list (i.e. deletes `Charlotte Oliveiro`) |
   | `exit` | Exits the application |

1. Refer to the [Feature-Description](#feature-description) section below for the full list of commands and their descriptions.

[Return to Table of Contents](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
## Example Usage

### Introduction
Described below are some commands that you can try to get yourself familiarised with ClientBook.

If you have followed the [Quick Start](#quick-start) guide correctly, you should see the screen below. 
For each of the commands, type them into the command box and press enter to execute the command.

<p align="center"><img src="images/Ui-annotate.png"></p>
<p align="center">Graphical user interface of ClientBook.</p>

<p><b>Step 1.</b></p> 

**Try adding a new Client contact using the command** `add n/James Lee p/91234567 e/james@gmail.com a/Blk 123 Serangoon Rd t/Friend t/Colleague i/OCBC#412>www.ocbc.com/policy/412`.


That is a very long command, but it can be broken down into simple parts. We have just added a client called James Lee with the following details:
* Phone number:91234567
* Email address: james@gmail.com
* Address:Blk 123 Serangoon Rd

We have also indicated that James is a friend as well as colleague of ours by adding the tags `Friend` and `Colleague`. Lastly,
we indicated that James has purchased a policy from us with a policy ID of OCBC#412 and that the policy's document can be found at `www.ocbc.com/policy/412`.


Now, if you scroll down the contact list, you should find James at the bottom of the list.

<p align="center"><img src="images/newContactJames.png"></p>


<p><b>Step 2.</b></p>

**Try editing a Client contact using the command `edit 1 p/61234567`.**


This command edits the phone number of the first client displayed in the contact list to 61234567. In this case, Alex Yeoh's
phone number in ClientBook has been changed to 61234567.

<p align="center"><img src="images/alexYeohChangePhone.png"></p>


<p><b>Step 3.</b></p>

**Delete a Client contact using the command `delete 3`.**


This command deletes the contact of the third client displayed in the contact list.


### Conclusion
Now that you have tried out the basic commands available in ClientBook, you can use the command `batch delete 1,2,3,4,5,6,7`
to delete all the sample entries and start using your very own ClientBook.

--------------------------------------------------------------------------------------------------------------------

## Overview

### Feature Summary 

| Feature | Description |
| ----------- | ----------- |
| [`help`](#help-viewing-help) | Viewing help |
| [`add`](#add-add-client-contact) | Add client contact |
| [`edit`](#edit-edit-client-contact) | Edit client contact |
| [`list`](#list-list-all-clients) | List all clients |
| [`find`](#find-search-for-client-contact-based-on-keywords) | Search for client contact based on keywords |
| [`policy`](#policy-display-policies-associated-with-a-client) | Display policies associated with a selected client |
| [`delete`](#delete-delete-client-contact) | Delete client |
| [`batch`](#batch-execute-commands-in-batch) | Execute commands in batch |
| [`sort`](#sort-sort-list-of-clients) | Sort list of clients |
| [`meet`](#meet-schedule-a-meeting-with-a-client) | Schedule a meeting with a client |
| [`addshortcut`](#addshortcut-add-shortcut) | Add shortcut |
| [`editshortcut`](#editshortcut-edit-shortcut) | Edit shortcut |
| [`deleteshortcut`](#deleteshortcut-delete-shortcut) | Delete shortcut |
| [`listshortcut`](#listshortcut-list-all-shortcuts) | List all shortcuts |
| [`clearshortcut`](#clearshortcut-clear-all-shortcuts) | Clear all shortcuts |
| [`lock`](#lock-lock-clientbook-with-a-user-selected-password) | Lock ClientBook with a user-selected password |
| [`unlock`](#unlock-unlock-clientbook) | Unlock ClientBook |
| [`exit`](#exit-exiting-the-program) | Exit ClientBook |
| [Saving data](#saving-data) | Save the data to a file in the home folder |
| [Editing data file](#editing-data-file) | Edit the data stored in the file in the home folder|

### What information can we store for each client contact?

<table>
  <tr>
    <td> <b>Attribute</b> </td>
    <td> <b>Identifier(s)</b> </td>
    <td> <b>Restriction(s) (if any)</b> </td>
  </tr>
  <tr>
    <td> Name </td>
    <td> <code>n</code> </td>
    <td> NA </td>
  </tr>
  <tr>
    <td> Phone number </td>
    <td> <code>p</code> </td>
    <td> 
         <ul><li>Should only contain numbers</li></ul>
         <ul><li>Must contain at least 3 digits</li></ul> 
    </td>
  </tr>
  <tr>
    <td> Address </td>
    <td> <code>a</code> </td>
    <td> NA </td>
  </tr>
  <tr>
    <td> Email </td>
    <td> <code>e</code> </td>
    <td> <ul><li>Should be of the form <code>name@email.com</code></li></ul>
         <ul><li><code>name</code> part of email should not contain the following characters <code>!#$%&'*+/=?\`{&#x7c;}~^.-</code></li></ul>
         <ul><li> <code>email</code> part of email should: 
             <ul><li>Be at least 2 characters long</li></ul>
             <ul><li>Start and end with either alphabets or numbers</li></ul>
             <ul><li>Consist only of alphabets and/or numbers, hyphens, or periods between characters</li></ul>
         </li></ul>
    </td>
  </tr>
  <tr>
    <td> Tag </td>
    <td> <code>t</code> </td>
    <td> <ul><li>Optional</li></ul> </td>
  </tr>
  <tr>
    <td> Insurance Policies </td>
    <td> <code>i</code> </td>
    <td> <ul><li>Optional</li></ul> 
         <ul><li>Should be of the form <code>PolicyId>URL</code> or <code>PolicyId</code></li></ul> 
         <ul><li><code>PolicyId</code> part should not contain the <code>></code> character</li></ul>
         <ul><li><code>URL</code> part should not contain the <code>></code> character (not a valid website link if it contains <code>></code>)</li></ul> 
    </td>
  </tr>
</table>

[Return to Table of Contents](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* **Words in UPPER_CASE are the parameters to be supplied by the user**. 
  * e.g. in `add n/NAME`, NAME is a parameter which can be used as `add n/John Doe`.


* **Items in square brackets are optional**. 
  * e.g. `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.


* **Items with …​ after them can be used multiple times**. 
  * e.g. `[t/TAG]…​` can be used 0 or more times, `t/basic`, `t/basic t/lifeinsurance` etc.


* **Parameters can be in any order**. 
  * e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.


* **If a parameter is expected only once in the command, but you specified it multiple times, only the last occurrence of the parameter will be taken.**
  * e.g. if you specify `p/12341234 p/56785678`, only `p/56785678` will be taken.


* **Extraneous parameters for commands that do not take in parameters** (such as `help`, `exit` and `listshortcut`) **will be ignored**. 
  * e.g. if the command specifies `help 123`, it will be interpreted as `help`.
  

* **Attributes in the form `-identifier` will be referred to as flags, while attributes in the form `identifier/` will be referred to as prefixes.**
  * e.g. for the `name` attribute, its flag would be `-n`, while its prefix would be `n/`.


</div>

--------------------------------------------------------------------------------------------------------------------

## Feature Description

### `help`: Viewing help 

**Purpose**: Shows a message explaining how to access this help page.

![help message](images/help-message.png)

**Format**: `help`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `add`: Add client contact

**Purpose**: Adds a client as contact to ClientBook.

**Format**: `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [i/POLICY_ID[>POLICY_URL]] [t/TAG]…​`

<div markdown="block" class="alert alert-info">
:bulb: 
**Tip**:
A person can have any number of tags and insurance policies (including 0).
</div>

* It is optional to include the `POLICY_URL` for the specified `POLICY_ID`.
* To include the URL, remember to use '>' to indicate that a particular insurance policy is linked to a URL, as shown in the second example below.

**Examples**:
* Example of a client with insurance policy but no URL associated with insurance policy
    * `add n/John Doe p/98765432 e/johnd@email.com a/Orchard i/Pol_#123456 t/basic`
* Example of a client with insurance policy and URL associated with insurance policy
    * `add n/Tom Tan p/91234567 e/tomt@email.com a/Orchard i/Policy_1274>www.myinsurancecompany.com/policy_1274 t/basic`
* Example with no insurance policy and no tag
    * `add n/Betsy Crowe e/betsycrowe@email.com a/Kent Ridge`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `edit`: Edit client contact 

**Purpose**: Edits an existing client contact in the ClientBook.

**Format**: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [i/POLICY_NUMBER]…​ [t/TAG]…​ [m/MEETING]…​`

* Edits the client at the specified `INDEX`.
    * `INDEX` refers to the index number shown in the displayed client list.
    * `INDEX` must be more than 1, and less than or equal to the index of the last item in the displayed list.
* At least one of the optional fields must be provided.

<div markdown="block" class="alert alert-info">
:exclamation: **Caution**: Existing values will be **replaced** with the input values.
</div>

**Examples**:
*  Edit the phone number and email address of the 1st person to be `91234567` and `johndoe@example.com` respectively.
    * `edit 1 p/91234567 e/johndoe@example.com`
      
      ![edit 1](images/edit-annotate.png)
    
*  Edit the name of the 2nd person to be `Betsy Crower`.
    * `edit 2 n/Betsy Crower`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `list`: List all clients 

**Purpose**: Shows a list of all clients in ClientBook. Optional identifiers can be specified to show a list with only the desired attributes.

**Format**: `list [-n] [-p] [-e] [-a] [-i] [-t] [-m]`

**Examples**: 
*  `list` without any specified identifiers shows a list of all clients and all their information.
  * `list`
    
    ![list](images/list.png)
    
*  One or more identifiers can be used to make `list` only show the specified information. The following command shows a list of all clients and their phone number and insurance policy number.
   * `list -p -i`
    
     ![list phone](images/list-phone-policy-annotate.png)

[Return to Table of Contents](#table-of-contents)
<br><br>

  
### `find`: Search for client contact based on keywords

**Purpose**: Finds and displays all clients whose field (name, phone, email, address, tags, insurance policy) contains any of the given keywords.
Optional identifiers can be added to show the list of matched clients with only the specified field(s), similar to the [`list`](#list-list-all-clients) command.

**Format**: `find IDENTIFIER/KEYWORD [& KEYWORDS]…​ [-IDENTIFIER]…​`

* The search is **case-insensitive**. 
  * E.g. `hans` will match `Hans`.
* The **order of the keywords does not matter**.
* Only **one** `IDENTIFIER` can be used in each `find` command.
    * For more information about the identifiers for each field, refer to [What information can we store for each client contact?](#what-information-can-we-store-for-each-client-contact).
* The delimiter `&` between keywords allows you to search for Clients using multiple keywords.
    
**Examples**:
* Find `Alex David` and `Alex Yeoh`.
  * `find n/alex`
<br><br>
* Find `Alex David`.
  * `find n/alex david`
  
    ![find_alex_david](images/find_alex_david-annotate.png)
<br><br>
* Find `Alex David`, `Alex Yeoh` and `David Li`.
  * `find n/alex & david`
<br><br>
* Find all persons whose address contains `geylang`.
  * `find a/geylang` - returns `Alex Yeoh` whose address is `Blk 30 Geylang Street 29, #06-40`
<br><br>
* Find the email and phone number of all persons whose names contain `alex` and `david` using the `&` delimiter, and only display their email and phone number.
  * `find n/alex & david -e -p`
    
    ![find_alex_&_david_with_filter](images/find-alex-&-david-with-filter-annotate.png)
<br><br>
[Return to Table of Contents](#table-of-contents)
<br><br>


### `policy`: Display policies associated with a client 

**Purpose**: Launches a popup window to show all the policies associated with the selected contact, if the selected contact has any policies.

**Format**: `policy INDEX`

* Selects the client at the specified `INDEX`.
* `INDEX` refers to the index number shown in the displayed client list.
* `INDEX` must be more than 1, and less than or equal to the index of the last item in the displayed list.

**Examples**:
* `policy 2` displays the policies associated with the 2nd person in the currently displayed list.
  
  ![with policy URL](images/with-policy-URL-annotate.png)
  
* `find n/Bernice` followed by `policy 1` displays the policies associated with the 1st person in the results of the `find` command.

[Return to Table of Contents](#table-of-contents)
<br><br>


### `delete`: Delete client contact

**Purpose**: Deletes the specified client from ClientBook after listing or finding contacts.

**Format**: `delete INDEX`

* Deletes the client at the specified `INDEX`.
* `INDEX` refers to the index number shown in the displayed client list.
* `INDEX` must be more than 1, and less than or equal to the index of the last item in the displayed list.

**Examples**:
* `delete 2` deletes the 2nd person in the currently displayed list.

* `find n/Charlotte` followed by `delete 1` deletes the 1st person in the results of the `find` command.

[Return to Table of Contents](#table-of-contents)
<br><br>


### `batch`: Execute commands in batch

**Purpose**: Allows you to execute some commands in bulk, so that you do not need to repeatedly type in the same 
commands.

**Format**: `batch COMMAND INDICES [ARGUMENTS]`

* Only `edit` and `delete` commands can be executed in batch.
    * For more information on how these commands work and their parameters, refer to the
      [`edit`](#edit-edit-client-contact) and [`delete`](#delete-delete-client-contact) sections accordingly.
* `INDICES` are comma-separated e.g. `1, 2, 3`, and they refer to the index number shown in the displayed client list.
* `INDICES` must all be more than 1, and less than or equal to the index of the last item in the displayed list.
* The optional `ARGUMENTS` input is only applicable if the `COMMAND` is `edit`.
* For `edit`, you can only batch edit the following attributes:
    * phone number
    * address
    * tags
    * insurance policies

<div markdown="block" class="alert alert-info">
:bulb: 
**Tip**:
The same rules apply when editing clients' phone number and address! <br>
If a parameter is expected only once in the command, but you specified it multiple times, **only the last occurrence** of the parameter will be taken. 
</div>

**Examples**:
* To batch edit the tags of more than 1 client contact.
    * `batch edit 1, 2, 4 p/91234567 a/Hougang Green t/TanFamily i/FamPol#111`
<br><br>
* To batch delete more than 1 client contact.
    * `batch delete 1, 2, 4`
<br><br>
      [Return to Table of Contents](#table-of-contents)
<br><br>


### `sort`: Sort list of clients

**Purpose**: Sorts the current list of clients in ClientBook.

**Format**: `sort -IDENTIFIER -DIRECTION`

* Sorts the list of clients according to the specified `IDENTIFIER` and `DIRECTION`.
* The specified `IDENTIFIER` can be `-n` to sort by name alphabetically or `-i` to sort by number of insurance policies, but not both.
* The specified `DIRECTION` can be `-asc` for ascending order or `-des` for descending order, but not both.

**Examples**:
* Sort the current list of clients by name in **descending** number of insurance policies.
    * `sort -i -des`

* Sort the current list of clients by name in **descending** alphabetical order.
    * `sort -n -des`

      ![sort](images/sort-des-annotate.png)

[Return to Table of Contents](#table-of-contents)
<br><br>


### `meet`: Schedule a meeting with a client

**Purpose**: Schedules a meeting on a particular date, start time, end time and place with a client in ClientBook.

**Format**: `meet INDEX [-ACTION] DATE START END PLACE`

* Schedules a meeting with the client at the specified `INDEX`.
* `INDEX` refers to the index number shown in the displayed client list.
* `INDEX` must be more than 1, and less than or equal to the index of the last item in the displayed list.
* `ACTION` can be `add` to add a meeting, `delete` to delete a meeting, `clear` to clear all meetings.
* If `-ACTION` is empty, the default action is to add a meeting.
* `DATE` must be in the `DD:MM:YYYY` format.
* `START` and `END` must be in the `HH:MM` format.
* `END` must be after `START` on the same `DATE`.
* `PLACE` cannot be empty.
* There is a check for clashes between meetings when adding a new meeting.

**Examples**:
* Add a meeting and there are no clashes.
    * `meet 1 20.05.2021 15:00 16:00 MRT`

      ![meet-add](images/meet-add.png)

* Add a meeting but there are clashes.
    * `meet 3 -add 20.05.2021 15:30 17:30 MRT`

      ![meet-clash](images/meet-clash.png)

* Delete a meeting.
    * `meet 1 -delete 20.05.2021 15:00 16:00 MRT`

* Clear all meetings.
    * `meet 2 -clear`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `addshortcut`: Add shortcut

**Purpose**: Adds a shortcut to the existing shortcut library.

**Format**: `addshortcut sn/SHORTCUT_NAME sc/SHORTCUT_COMMAND`

* Adds a shortcut named `SHORTCUT_NAME` to the shortcut library and assigns a valid command `SHORTCUT_COMMAND` to it.
* The specified `SHORTCUT_NAME` must be alphanumeric and must not already exist the shortcut library.
* The specified `SHORTCUT_COMMAND` must be a valid command.

**Examples**:
* Add a shortcut named `ls` to represent the command `listshortcut` in the shortcut library.
    * `addshortcut sn/ls sc/listshortcut`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `editshortcut`: Edit shortcut

**Purpose**: Edits the command of a shortcut in the existing shortcut library.

**Format**: `editshortcut sn/SHORTCUT_NAME sc/SHORTCUT_COMMAND`

* Finds a shortcut named `SHORTCUT_NAME` in the shortcut library and replaces its existing command with the provided valid command `SHORTCUT_COMMAND`.
* The specified `SHORTCUT_NAME` must be alphanumeric and must exist the shortcut library.
* The specified `SHORTCUT_COMMAND` must be a valid command.

**Examples**:
* Edit a shortcut named `ls` in the shortcut library such that it takes on a new command `list`.
    * `editshortcut sn/ls sc/list`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `deleteshortcut`: Delete shortcut

**Purpose**: Deletes a shortcut in the existing shortcut library.

**Format**: `deleteshortcut SHORTCUT_NAME`

* Finds a shortcut named `SHORTCUT_NAME` in the shortcut library and deletes it from the shortcut library.
* The specified `SHORTCUT_NAME` must be alphanumeric and must exist in the shortcut library.

**Examples**:
* Delete a shortcut named `ls` in the shortcut library.
    * `deleteshortcut ls`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `listshortcut`: List all shortcuts

**Purpose**: Lists all shortcuts in the existing shortcut library.

**Format**: `listshortcut`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `clearshortcut`: Clear all shortcuts

**Purpose**: Clears all shortcuts in the existing shortcut library.

**Format**: `clearshortcut`

[Return to Table of Contents](#table-of-contents)
<br><br>


### `lock`: Lock ClientBook with a user-selected password 

**Purpose**: Locks ClientBook with a user-selected password.

**Format**: `lock [CURRENT_PASSWORD] [NEW_PASSWORD]`

* Verifies the current password before locking ClientBook with the new password.
* The `CURRENT_PASSWORD` field can be omitted if ClientBook is not yet locked.
* When `CURRENT_PASSWORD` and `NEW_PASSWORD` fields are both omitted, ClientBook will attempt to lock itself using the last used password that is safely stored on your device.

<div markdown="block" class="alert alert-info">
:exclamation: **Note**: After setting a password, ClientBook can only be launched through Command Prompt or Terminal.
  * Refer to [Quick Start](#quick-start) on how to launch the application through Command Prompt or Terminal.
</div>

**Examples**:
* Lock ClientBook with password `123`.
  * `lock 123`

    ![lock 123](images/lock-new-pw.png)

* Change ClientBook's password from `123` to `456`.
  * `lock 123 456`

    ![lock 456](images/lock-update-pw.png)    

[Return to Table of Contents](#table-of-contents)
<br><br>


### `unlock`: Unlock ClientBook 

**Purpose**: Unlocks ClientBook.

**Format**: `unlock CURRENT_PASSWORD`

* Verifies the current password before unlocking ClientBook.
* ClientBook's password is removed after executing this command. After executing this command, future launches of ClientBook will not require a password.

**Examples**:
* Unlock ClientBook with wrong password `123`.
    * `unlock 123`

      ![unlock 123](images/unlock-wrong-pw.png)

* Unlock ClientBook with correct password `456`.
    * `unlock 456`

      ![unlock 456](images/unlock-correct-pw.png)

[Return to Table of Contents](#table-of-contents)
<br><br>


### `exit`: Exiting the program 

**Purpose**: Exits the program.

**Format**: `exit`

[Return to Table of Contents](#table-of-contents)
<br><br>

### Keyboard commands

**Purpose**: We note that continuously typing the same command keywords can become tiresome. Hence, we have provided 
[keyboard commands](#summary-of-keyboard-commands) which when pressed, will fill in the command keyword for you.

### Saving data

**Purpose**: ClientBook saves its data to a file in the home folder automatically after any command that changes the data. There is no need to save manually.

[Return to Table of Contents](#table-of-contents)
<br><br>


### Editing data file

**Purpose**: ClientBook saves its data as a JSON file `[JAR file location]/data/clientbook.json`. Advanced users are welcome to update data directly by editing that data file.

* The data file is stored in a zip file inside the `data` folder in the same folder. 
* If you previously set a `lock` for ClientBook, the zip folder can be unzipped with that same password.

<div markdown="block" class="alert alert-info">
:exclamation: **Caution**:
If your changes to the data file makes its format invalid, **all your data will be lost** at the next run.
</div>

[Return to Table of Contents](#table-of-contents)
<br><br>


### Upcoming features (v2.0 and beyond!)

* Archiving data files
* Customisable user interface
* Login interface
* And more!

[Return to Table of Contents](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
## Frequently Asked Questions

### Setting Up
**Q**: How do I check that Java is installed on my laptop?<br>
**A**: Launch Command Prompt (for Windows) or Terminal (for Mac OS/Linux) and enter the following command: `java -version`.
If you get an error message (`Java command not found`), it means that Java is not installed on your laptop.<br>

**Q**: How do I install Java?<br>
**A**: Head over to the official Java website [here](https://www.oracle.com/sg/java/technologies/javase-jdk11-downloads.html), and download the appropriate file for your system!

**Q**: How do I transfer my data to another laptop?<br>
**A**: Copy the entire home folder (with all the files inside) over to the other laptop! It's as simple as that!

[Return to Table of Contents](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Summary of Commands

| Action | Format | Example |
| --------|------------------ | --- |
[**Help**](#viewing-help--help) | `help` | `help` |
[**Add**](#add-client-contact-add) | `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [i/POLICY_ID] [t/TAG]…​` | `add n/James Ho p/22224444 e/jamesho@example.com a/123, Clementi Rd, 1234665 i/Policy_1023 t/premium t/lifeinsurance` |
[**Edit**](#edit-client-contact-edit) | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [i/POLICY_NUMBER]…​ [t/TAG]…​` | `edit 2 n/James Lee e/jameslee@example.com` |
[**List**](#list-all-clients--list) | `list [-IDENTIFIER]` | `list -i` |
[**Find**](#search-for-client-contact-based-on-keywords-find) | `find IDENTIFIER/KEYWORD [& KEYWORDS]…​ [-IDENTIFIER]…​` | `find a/Bedok & Clementi -p` |
[**Policy**](#display-policies-associated-with-selected-client-policy) | `policy INDEX` | `policy 4` |
[**Delete**](#delete-client-delete) | `delete INDEX` | `delete 3` |
[**Batch**](#batch-execute-commands-in-batch) | `batch COMMAND INDICES [ARGUMENTS]` | `batch edit 1, 2, 4 p/91234567 a/Hougang Green t/TanFamily i/FamPol#111` |
[**Sort**](#sort-list-of-clients-sort) | `sort -IDENTIFIER -DIRECTION` | `sort -n -d` |
[**Meet**](#schedule-a-meeting-with-a-client-meet) | `meet INDEX [-ACTION] DATE START END PLACE` | `meet 1 20.05.2021 15:00 16:00 MRT` |
[**Add Shortcut**](#addshortcut-add-shortcut) | `addshortcut sn/SHORTCUT_NAME sc/SHORTCUT_COMMAND` | `addshortcut sn/ls sc/listshortcut` |
[**Edit Shortcut**](#editshortcut-edit-shortcut) | `editshortcut sn/SHORTCUT_NAME sc/SHORTCUT_COMMAND` | `editshortcut sn/ls sc/list` |
[**Delete Shortcut**](#deleteshortcut-delete-shortcut) | `deleteshortcut SHORTCUT_NAME` | `deleteshortcut ls` |
[**List Shortcuts**](#listshortcut-list-all-shortcuts) | `listshortcut` | `listshortcut` |
[**Clear Shortcuts**](#clearshortcut-clear-all-shortcuts) | `clearshortcut` | `clearshortcut` |
[**Lock**](#lock-clientbook-with-a-user-selected-password-lock) | `lock [CURRENT_PASSWORD] NEW_PASSWORD` | `lock 123 456` |
[**Unlock**](#unlock-clientbook--unlock) | `unlock [CURRENT_PASSWORD]` | `unlock 456` |
[**Exit**](#exiting-the-program--exit) | `exit` | `exit` |

[Return to Table of Contents](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
## Summary of Keyboard Commands

| Shortcut | Output |
| --------|------------------ |
CTRL + A | `add` |
CTRL + D | `delete` |
CTRL + E | `edit` |
CTRL + F | `find` |
CTRL + L | `list` |
CTRL + S | `sort` |

--------------------------------------------------------------------------------------------------------------------
## Glossary

1. **CLI** (Command Line Interface) A text box like interface which allows a user to enter and execute commands.


2. **GUI** (Graphical user interface) A form of user interface with graphical features such as icons that allows a user to interact with our program.


3. **UI** (User Interface) An interface for a user to interact with a program.


4. **Java** A programming language and computing platform that is used to run ClientBook.


5. **Command Prompt** A command line interpreter application on the Windows operating system.


6. **Terminal** A command line interpreter application on MacOS/Linux operating systems.


7. **Attribute** The types of information you can store in ClientBook. E.g. phone number, address, name of your clients.


8. **Identifier** The alphabetical letter associated with an attribute.


9. **JSON** (JavaScript Object Notation) A format for storing and transporting data.

[Return to Table of Contents](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Contact Us

Didn't find what you were looking for? Contact us at [clientbook@email.com](clientbook@email.com).

ClientBook is still a work in progress and we hope to be able to further improve ClientBook to suit your needs. 
Should you have any suggestions, feel free to drop us an email! 
We would love to hear from you insurance agents who are actively out and about, providing us with the best services.

[Return to Table of Contents](#table-of-contents)
