public class Exercise_5

{

    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();

        linkedIntList.add(1);
        linkedIntList.add(1);
        linkedIntList.add(3);
        linkedIntList.add(3);
        linkedIntList.add(5);
        linkedIntList.add(5);
        linkedIntList.add(5);
        linkedIntList.add(6);
        linkedIntList.add(7);
        linkedIntList.add(8);


        System.out.println(countDublicates(linkedIntList));
    }

    public static int countDublicates(LinkedIntList linkedIntList)
    {
        int countDublicates=0;
        ListNode current = linkedIntList.getFront();
        int listSize = linkedIntList.size();

        for (int i = 0; i < listSize ; i++)
        {
            if (current.next != null)
            {
                System.out.println(current.data== current.next.data);
                if (current.data == current.next.data)
                {
                    countDublicates++;
                }
            }
            current = current.next;
        }

        return countDublicates;
    }

}
