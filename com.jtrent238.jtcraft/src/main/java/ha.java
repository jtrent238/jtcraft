/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ha
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   private boolean f;
/*    */   
/*    */   public ha() {}
/*    */   
/*    */   public ha(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
/*    */   {
/* 22 */     this.a = paramInt1;
/* 23 */     this.c = paramInt2;
/* 24 */     this.d = paramInt3;
/* 25 */     this.e = paramInt4;
/* 26 */     this.b = paramInt5;
/* 27 */     this.f = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.readInt();
/* 33 */     this.c = paramet.readInt();
/* 34 */     this.d = (paramet.readByte() & 0xFF);
/* 35 */     this.e = paramet.readInt();
/* 36 */     this.b = paramet.readInt();
/* 37 */     this.f = paramet.readBoolean();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 42 */     paramet.writeInt(this.a);
/* 43 */     paramet.writeInt(this.c);
/* 44 */     paramet.writeByte(this.d & 0xFF);
/* 45 */     paramet.writeInt(this.e);
/* 46 */     paramet.writeInt(this.b);
/* 47 */     paramet.writeBoolean(this.f);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 52 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 56 */     return this.f;
/*    */   }
/*    */   
/*    */   public int d() {
/* 60 */     return this.a;
/*    */   }
/*    */   
/*    */   public int e() {
/* 64 */     return this.b;
/*    */   }
/*    */   
/*    */   public int f() {
/* 68 */     return this.c;
/*    */   }
/*    */   
/*    */   public int g() {
/* 72 */     return this.d;
/*    */   }
/*    */   
/*    */   public int h() {
/* 76 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */