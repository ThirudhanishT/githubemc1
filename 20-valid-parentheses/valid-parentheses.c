bool isValid(char* s) {
    int ni=0;
    for (int i=0;s[i]!='\0';i++)
    {
        ni++;
    }
    int si[ni];
    for(int i=0;i<ni;i++)
    {
        si[i]=s[i];
    }
    int top=-1;
    char stack[ni];
    for(int i=0;i<ni;i++)
    {
        char c=si[i];
        if(c=='('|| c=='[' || c=='{')
        {
            stack[++top]=c;
        }
        else if(c==')'|| c==']'|| c=='}')
        {
            if(top==-1)
            {
                return false;
            }
            char topc=stack[top];
            if((c==')'&& topc!='(') || (c==']' && topc!='[') || (c=='}' && topc!='{'))
            {
                return false;
            }
            top--;
        }
    }
    if(top==-1)
    {
        return true;
    }
    return false;
}