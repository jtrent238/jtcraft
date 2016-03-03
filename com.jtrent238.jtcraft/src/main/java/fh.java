/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fh
/*    */ {
/*    */   private final fi a;
/*    */   private final String b;
/*    */   
/*    */   public fh(fi paramfi, String paramString)
/*    */   {
/* 12 */     this.a = paramfi;
/* 13 */     this.b = paramString;
/*    */   }
/*    */   
/*    */   public fi a() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b() {
/* 21 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 26 */     if (this == paramObject) return true;
/* 27 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) { return false;
/*    */     }
/* 29 */     fh localfh = (fh)paramObject;
/*    */     
/* 31 */     if (this.a != localfh.a) return false;
/* 32 */     if (this.b != null ? !this.b.equals(localfh.b) : localfh.b != null) { return false;
/*    */     }
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 39 */     return "ClickEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 47 */     int i = this.a.hashCode();
/* 48 */     i = 31 * i + (this.b != null ? this.b.hashCode() : 0);
/* 49 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */