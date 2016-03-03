/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fl
/*    */ {
/*    */   private final fm a;
/*    */   private final fj b;
/*    */   
/*    */   public fl(fm paramfm, fj paramfj)
/*    */   {
/* 12 */     this.a = paramfm;
/* 13 */     this.b = paramfj;
/*    */   }
/*    */   
/*    */   public fm a() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public fj b() {
/* 21 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 26 */     if (this == paramObject) return true;
/* 27 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) { return false;
/*    */     }
/* 29 */     fl localfl = (fl)paramObject;
/*    */     
/* 31 */     if (this.a != localfl.a) return false;
/* 32 */     if (this.b != null ? !this.b.equals(localfl.b) : localfl.b != null) { return false;
/*    */     }
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 39 */     return "HoverEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
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


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */