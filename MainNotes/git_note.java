1-git reset --->remove from staging area
2-git init  ---> intialize New reposotory
3-git status---> views what is New in staging area
4-git log   --->view commit history of my branch and its parent
--git log --follow [file] --->Lists version history for a file, including renames
5-git add <file_name>     ---> add this file to staging area 
--git add -A              --->add all file in branch
6-git diff id_1  and id_2 ---> git difreent between two commits
--git diff --staged       --->Shows file differences between staging and the last file version
--git diff [first-branch]...[second-branch] --->Shows content differences between two branches
-- git log --follow [file] --->Lists version history for a file, including renames
7-git reset [file]         --->Unstages the file, but preserve its contents
8-git commit               ---> add what in stage area
--git commit -m "[descriptive message]"
9-git branch                  --->Lists all local branches in the current repository
10-git branch [branch-name]   --->switch to  branch
11-git checkout [branch-name] --->Switches/Create to the specified branch and updates the working directory
--git checkout <commit-hash>    --->you could checkout all files more easily 
--git checkout <commit-id> <filename>  ---> got the files  wanted back from the old commit file
12-git branch -d [branch-name]--->Deletes the specified branch
12-git merge [branch]     --->Combines the specified branch’s history into the current branch
13-git rm [file]          --->Deletes the file from the working directory and stages the deletion (does it mean delet  from branch and staging area);??????try
14-git rm --cached [file] --->Removes the file from version control but preserves the file locally  ????try
15-git mv [file-original] [file-renamed]--->Changes the file name and prepares it for commit
16-git reset [commit_id]        --->Undoes all commits after [commit_id], preserving changes locally ????try
---git reset --soft c14809fa    --->It will make your local files changed to be like they were then, but leave your history etc
---git reset --hard c14809fa    --->It will make your local code and local history be just like it was at that commit.
                                    But then if you wanted to push this to someone else who has the New history,it would fail

17-git branch -m <newname>         --->If you want to rename the current branch
18- git push -u origin <branch-name> --->push localBranch to remot bransh
---or--git push <remote-name> <local-branch-name>:<remote-branch-name>
---where origin sets as git remote add origin ssh://example.com/var/git/myapp.git
---git checkout -b bug_fixes origin/development  ---> If you want to create a branch from a remote branch say development
---git pull origin master --->Anytime you want to update your branch from any other branch say master.
19-git push origin (null""):[name_of_your_new_branch] --->delete branch in gethip
20--git fetch [name_of_your_remote] --->Update your branch when the original branch from official repository has been updated
    ----git fetch --all --->useful for seeing New remote branches
21--->git clean--->To delete all untracked files and then continue with usual git pull
----------------------------------------------------------------------------------------
git fetch <remote>
Fetch all of the branches from the repository. 
This also downloads all of the required commits and files from the other repository.
git fetch <remote> <branch>
Same as the above command, but only fetch the specified branch.

To approve the changes and merge them into your local master branch with the following commands:

git checkout master
git log origin/master
Then we can use git merge origin/master

git merge origin/master
The origin/master and master branches now point to the same commit, and you are synchronized with the upstream developments.


git pull <remote>
Fetch the specified remote’s copy of the current branch and immediately merge it into the local copy. 
This is the same as git fetch <remote> followed by git merge origin/<current-branch>.

git pull --rebase <remote>
Same as the above command, but instead of using git merge to 



-------------------------------------------------------------------------------------------
How can I remove a commit on GitHub?---
---------------------------------------
Find the ref spec of the commit you want to be the head of your branch on Github and use the f# get the version of the file from the given commit
git checkout <commit> path/to/file
# and commit this modification
git commit
(The checkout command first reads the file into the index, then copies it into the work tree, so there's no need to use git add to add it to the index in preparation for committing.)

If your file may not have a simple history (e.g. renames and copies), see VonC's excellent comment. git can be directed to search more carefully for such things, at the expense of speed.
 If you're confident the historys simple, you needn't bother.ollowing command:
git push origin +[ref]:[branchName]
In your case, if you just want to go back one commit, find the beginning of the ref for that commit, say for example it is 7f6d03, and the name of the branch you want to change, say for example it is master, and do the following:
git push origin +7f6d03:master
The plus character is interpreted as --force, which will be necessary since you are rewriting history.
Note that any time you --force a commit you could potentially rewrite other peoples history who merge your branch. However, if you cat
-------------------------------------------------------------------------------------------
 How to revert changes to previous state---
 ------------------------------------------

You can do git revert <commit> --->to all the commits that have been made after your required state.
(In the reverse order to    avoid any conflicts).
This is a clean way if there are other people sharing the repo, but a little effortsome. (You may automate though...?)
-------------------------------------------------------------------------------------------------------------------
How to check out a remote Git branch----
---------------------------------------
$ git fetch origin
 

$ git checkout demo
Branch demo set up to track remote branch demo from origin.
Switched to a New branch 'demo'
As you can see
running git fetch origin retrieved any remote branches we were not yet setup to track on our local machine. 
From there, since we now have a ref to the remote branch,
 we can simply run git checkout remote_branch and we will gain the benefits of remote tracking.
---------------------------------------------------------------------------------------------
 --Add a remote branch:
 --------------------------------------------------------

git push origin master:new_feature_name
Check if everything is good (fetch origin and list remote branches):

git fetch origin
git branch -r
Create a local branch and track the remote branch:

git checkout -tb new_feature_name origin/new_feature_name
Update everything:

git pull

----------------------------------------------------------------------------------------------
Reverting a single file to a previous version in git----
--------------------------------------------------------
# get the version of the file from the given commit
git checkout <commit> path/to/file
# and commit this modification
git commit
(The checkout command first reads the file into the index, then copies it into the work tree, so there is no need to use git add to add it to the index in preparation for committing.)

If your file may not have a simple history (e.g. renames and copies), 
  git can be directed to search more carefully for such things, at the expense of speed.
  If you are confident the history  simple, you needn not bother.

----another soultions---
 git revert <commit> 
 git reset 
 git add <path> 
 git commit ... 
 git reset --hard # making sure you didnn ot have uncommited changes earlier 
----------------------------------------------------------------------------------------------
How to ignore commit pushed to Gethub:---
-----------------------------------------
git reset 7f6d03 --hard (7f6d03 is Commit id before my wrong commit).
git push origin -f
--------------------------------------------------------------------------------------------
How to make GIT ignore my changes---
------------------------------------
git checkout '.'
will discard any uncommitted changes in the current directory (the dot means current directory).

EDIT in response to @GokulNK:

If you want to keep those changes for future use, you have 2 options:

git stash: this will save those changes in a stack. You can apply the changes to your working copy later using git stash pop
git diff > changes.patch: This will save those changes to the file changes.patch. If you want to apply them to your working copy you can do so: git apply changes.patch.

-------------------------------------------------------------------------------------------------------
Make an existing Git branch track a remote branch?---
----------------------------------------------------------------------------------------------
http://stackoverflow.com/questions/520650/make-an-existing-git-branch-track-a-remote-branch?rq=1
------------------------------------------------------------

========================================================================================================
Often needs:
~~~~~~~~~~~~

Change your remote URL from SSH to HTTPS with the git remote set-url command.
git remote set-url origin http://github.com/ddopik/Android-Lib/tree/AppRefactor_Dagger

--git checkout <commit-hash>    --->you could checkout all files more easily 
--git checkout <commit-id> <filename>  ---> got the files  wanted back from the old commit file
--git merge [branch]     --->Combines the specified branch’s history into the current branch
--	
 <branch-name> --->push localBranch to remot bransh (note that is push not ovveride)
--git reset --hard     --->this will  discard all changes you made for file and will not ask you to commit them
                       --->and will return your file to the last commit
                       It might be the case that you are on another branch than the master branch, then type:

--->git push origin HEAD:master
so git understands that you want to push up current HEAD and not the master branch.

git remote add origin https://github.com/ddopik/Android-Lib/tree/AppRefactor_Dagger
git remote set-url origin https://github.com/ddopik/Android-Lib
git config --global user.email "ddopik.01@gmail.com"
git config --global user.name "ddopik"

Change your remote URL from SSH to HTTPS with the git remote set-url command.
git remote set-url origin http://github.com/ddopik/Android-Lib/tree/AppRefactor_Dagger

