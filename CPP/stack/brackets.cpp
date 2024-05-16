#include <bits/stdc++.h>
using namespace std;

int areBracketsBalanced(string exp)
{
    stack<char> s;

    for(int i=0;i<exp.length();i++)
    {
        if(s.empty())
        {
            s.push(exp[i]);
        }
        else if ((s.top()=='(' && exp[i]==')') || 
                (s.top()=='{' && exp[i]=='}') ||
                (s.top()=='[' && exp[i]==']'))
        {
            s.pop();
        }
        else
        {
            s.push(exp[i]);
        }
    }

    if(s.empty())
    {
        return true;
    }
    return false;
}


int main()
{
    string exp="{()}[]";

    if(areBracketsBalanced(exp))
    {
        cout<<"brackets balanced";
    }
    else
    {
        cout<<"Not balanced";
    }
    return 0;
}

