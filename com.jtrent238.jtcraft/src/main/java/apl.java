/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apl
/*    */   extends aor
/*    */ {
/*    */   public byte a;
/*    */   public boolean i;
/*    */   
/*    */   public void b(dh paramdh)
/*    */   {
/* 14 */     super.b(paramdh);
/* 15 */     paramdh.a("note", this.a);
/*    */   }
/*    */   
/*    */   public void a(dh paramdh)
/*    */   {
/* 20 */     super.a(paramdh);
/* 21 */     this.a = paramdh.d("note");
/* 22 */     if (this.a < 0) this.a = 0;
/* 23 */     if (this.a > 24) this.a = 24;
/*    */   }
/*    */   
/*    */   public void a() {
/* 27 */     this.a = ((byte)((this.a + 1) % 25));
/* 28 */     e();
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 32 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).o() != awt.a) { return;
/*    */     }
/* 34 */     awt localawt = paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o();
/*    */     
/* 36 */     int j = 0;
/* 37 */     if (localawt == awt.e) j = 1;
/* 38 */     if (localawt == awt.p) j = 2;
/* 39 */     if (localawt == awt.s) j = 3;
/* 40 */     if (localawt == awt.d) { j = 4;
/*    */     }
/* 42 */     paramahb.c(paramInt1, paramInt2, paramInt3, ajn.B, j, this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */