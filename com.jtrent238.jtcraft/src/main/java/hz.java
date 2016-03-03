/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hz
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private add c;
/*    */   
/*    */   public hz() {}
/*    */   
/*    */   public hz(int paramInt1, int paramInt2, add paramadd)
/*    */   {
/* 18 */     this.a = paramInt1;
/* 19 */     this.b = paramInt2;
/* 20 */     this.c = (paramadd == null ? null : paramadd.m());
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 25 */     this.a = paramet.readInt();
/* 26 */     this.b = paramet.readShort();
/* 27 */     this.c = paramet.c();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 32 */     paramet.writeInt(this.a);
/* 33 */     paramet.writeShort(this.b);
/* 34 */     paramet.a(this.c);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 39 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public add c() {
/* 43 */     return this.c;
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 48 */     return String.format("entity=%d, slot=%d, item=%s", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), this.c });
/*    */   }
/*    */   
/*    */   public int d() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public int e() {
/* 56 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */