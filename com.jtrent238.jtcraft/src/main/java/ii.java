/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ii
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private String[] d;
/*    */   
/*    */   public ii() {}
/*    */   
/*    */   public ii(int paramInt1, int paramInt2, int paramInt3, String[] paramArrayOfString)
/*    */   {
/* 19 */     this.a = paramInt1;
/* 20 */     this.b = paramInt2;
/* 21 */     this.c = paramInt3;
/* 22 */     this.d = new String[] { paramArrayOfString[0], paramArrayOfString[1], paramArrayOfString[2], paramArrayOfString[3] };
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.readInt();
/* 30 */     this.b = paramet.readShort();
/* 31 */     this.c = paramet.readInt();
/* 32 */     this.d = new String[4];
/* 33 */     for (int i = 0; i < 4; i++) {
/* 34 */       this.d[i] = paramet.c(15);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet) {
/* 39 */     paramet.writeInt(this.a);
/* 40 */     paramet.writeShort(this.b);
/* 41 */     paramet.writeInt(this.c);
/* 42 */     for (int i = 0; i < 4; i++) {
/* 43 */       paramet.a(this.d[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fv paramfv) {
/* 48 */     paramfv.a(this);
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
/*    */   
/*    */   public String[] f() {
/* 64 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */