/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ig
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public ig() {}
/*    */   
/*    */   public ig(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 17 */     this.a = paramInt1;
/* 18 */     this.b = paramInt2;
/* 19 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     this.a = paramet.readInt();
/* 25 */     this.b = paramet.readInt();
/* 26 */     this.c = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 31 */     paramet.writeInt(this.a);
/* 32 */     paramet.writeInt(this.b);
/* 33 */     paramet.writeInt(this.c);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 38 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 43 */     return false;
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 48 */     return String.format("x=%d, y=%d, z=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 56 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 60 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */