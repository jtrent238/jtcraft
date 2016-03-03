/*    */ public class brq implements Comparable
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   private final boolean d;
/*    */   
/*    */   public brq(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
/*    */   {
/* 10 */     this.a = paramString1;
/* 11 */     this.b = paramString2;
/* 12 */     this.c = paramString3;
/* 13 */     this.d = paramBoolean;
/*    */   }
/*    */   
/*    */   public String a() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 21 */     return this.d;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 26 */     return String.format("%s (%s)", new Object[] { this.c, this.b });
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 32 */     if (this == paramObject) return true;
/* 33 */     if (!(paramObject instanceof brq)) { return false;
/*    */     }
/* 35 */     return this.a.equals(((brq)paramObject).a);
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 40 */     return this.a.hashCode();
/*    */   }
/*    */   
/*    */   public int a(brq parambrq)
/*    */   {
/* 45 */     return this.a.compareTo(parambrq.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */