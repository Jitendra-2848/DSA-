
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// TIme Complexity  : O(n)
// space Complexity : O(1)

struct ListNode{
    int val;
    struct ListNode *next;
};
bool hasCycle(struct ListNode *head) {
    if (head == NULL) return false;

    struct ListNode *slow = head;
    struct ListNode *fast = head;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast) return true;
    }

    return false;
}
int main() {
    struct ListNode a, b,c,d,e;

    a.val = 1;
    b.val = 2;
    c.val = 3;
    d.val = 4;
    e.val = 5;

    a.next = &b;
    b.next = &c;
    c.next = &d;
    d.next = &e;
    e.next = &c;  
    //it means pos of cycle is 3

    if (hasCycle(&a)) {
        printf("Cycle detected\n");
    } else {
        printf("No cycle\n");
    }

    return 0;
}
