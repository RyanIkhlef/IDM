# File for tests markdown parser


# Code

To produce a code block in Markdown, simply indent every line of the block by at least 4 spaces or 1 tab. For example, given this input:

This is a normal paragraph:

    This is a code block.
    On several line
    
    And even with a blank line
    
    [link in code](#)

````
Code en debut de ligne

Avec \`\`\`\`
Comme separateur
  [link in code](#)

````

A paragraphe with ````inline code [link in code](#)```` and an end.

This is a paragraphe.
It continue on this line

This is a 2nd paragraphe.

## Title level 2

Hello the world.

## 2 Title level 2

A line with **strong** and an *italic*.
Et aussi un *mix*.


A line with double space at the end  

A normal line.

# Links

A paragraph with a  [link](#) not at the end.

[A link](#)at beginning of text.

Try [**strong** title](https://wiki.eclipse.org/The_Official_Eclipse_FAQs#Workspace_and_Resources_API).

Now, try [image ![image](https://www.eclipse.org/images/egg-incubation.png) ](https://wiki.eclipse.org/The_Official_Eclipse_FAQs#Workspace_and_Resources_API).

And now an image : ![image](https://www.eclipse.org/images/egg-incubation.png)

And finally a [linkwith title](# "title")


# Title level 1

List :

- start list. This is a paragraph
  on multiple lines.
  
  And another paragraph
- item 2.
  * level 2 item 1
  * level 2 item 2
  - level 2 item 3
    - level 3 item 1
    - level 3 item 2
    - level 3 item 3
    - level 4 item 1
        - next level ??
  - level 2 item 4
  - level 2 item 5
  
un paragraphe 
	  
# Try Citation
Citation :

> Start citation
> > double citation
> > - list in citation
> > - item 2
> > - item 3
> > fin de list
> > 

# Titre avec un [lien](#) et un *italic**

Un dernier paragraphe.

# Lines

* * *

----------------------

*************

- - -



