# bonusRates
The Awesome Sales Company plans to award bonuses to its staff. There are two categories for bonuses: longevity and sales. The longevity bonus gives those employees who have been with the company for more than 10 years a bonus of 2% of their salary, and gives those employees who have been with the company for more than 5 years a bonus of 1% of their salary. The sales bonus gives those employees who have a sales total of more than $250,000 a bonus of 2% of their salary, and gives those employees who have a sales total of more than $125,000 a bonus of 1% of their salary. All others get a bonus of $100. An employee may receive only one bonus. For example, if the employee has been with the company for more than 10 years (so eligible for the longevity bonus of 2%) and their sales total is more than $125,000 (so eligible for the sales bonus of 1%), that employee gets the 2% bonus.  

Note that there are 2 options for a 2% bonus, and 2 options for a 1% bonus, otherwise the bonus is $100. Your code MUST use logical operators (AND, OR) to test for the different bonus rates in a SINGLE IF-ElseIF-Else structure. If (something is true) then the bonus rate is 2%, else if (something else is true) then the bonus rate is 1%, else the bonus is $100. You can use only one IF structure to determine the bonus.  

Write a project that asks the user for an employee’s years of service and sales total, then calculates the percentage rate for the bonus. 

Run the program as many times as necessary to test every possibility, to make sure every path through the code works correctly. Consider each different element and the outcome. For example, longevity is one test; if years of service > 10, bonus rate = 2%. So run a test with years of service > 10 (for example, 12, as in the sample session), and sales total = 0 (so you are testing only the longevity). The other test is sales total; if sales total > $250,000, bonus rate = 2%. So run a test with sales total > $125,000 (for example, $150,00), and years of service = 1%. Make sure that when you enter longevity of 1 year and sales total of $150,000, you get the correct answer of 1% bonus rate.

Do NOT include literal values in any calculations, always use variable

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
