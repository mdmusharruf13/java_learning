class M12_Strings{
    public static void main(String [] args){
        
        // String are immutable(cannot be modified)
        String name = new String("java"); 
        // area for name is created in string constant pool with a specific address
        System.out.println(name);
        name = name + " language"; 
        // another area is created for name after concatenating word "language" with a new address in string constant pool
        System.out.println(name);

        // StringBuffer are mutable(can be modified)
        StringBuffer sb = new StringBuffer("Musharruf");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Nawaz");
        System.out.println(sb);
        sb.insert(0,"Md ");
        System.out.println(sb);
        sb.setLength(50);
        System.out.println(sb.capacity());
    }
}