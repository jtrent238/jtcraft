/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ud
/*    */   extends ui
/*    */ {
/*    */   private sw b;
/*    */   private ahb c;
/*    */   int a;
/*    */   
/*    */   public ud(sw paramsw)
/*    */   {
/* 21 */     this.b = paramsw;
/* 22 */     this.c = paramsw.o;
/* 23 */     a(7);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 28 */     if (this.b.aI().nextInt(this.b.f() ? 50 : 1000) != 0) { return false;
/*    */     }
/* 30 */     int i = qh.c(this.b.s);
/* 31 */     int j = qh.c(this.b.t);
/* 32 */     int k = qh.c(this.b.u);
/* 33 */     if ((this.c.a(i, j, k) == ajn.H) && (this.c.e(i, j, k) == 1)) return true;
/* 34 */     if (this.c.a(i, j - 1, k) == ajn.c) return true;
/* 35 */     return false;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 40 */     this.a = 40;
/* 41 */     this.c.a(this.b, (byte)10);
/* 42 */     this.b.m().h();
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 47 */     this.a = 0;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 52 */     return this.a > 0;
/*    */   }
/*    */   
/*    */   public int f() {
/* 56 */     return this.a;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 61 */     this.a = Math.max(0, this.a - 1);
/* 62 */     if (this.a != 4) { return;
/*    */     }
/* 64 */     int i = qh.c(this.b.s);
/* 65 */     int j = qh.c(this.b.t);
/* 66 */     int k = qh.c(this.b.u);
/*    */     
/* 68 */     if (this.c.a(i, j, k) == ajn.H) {
/* 69 */       if (this.c.O().b("mobGriefing")) {
/* 70 */         this.c.a(i, j, k, false);
/*    */       }
/* 72 */       this.b.p();
/* 73 */     } else if (this.c.a(i, j - 1, k) == ajn.c) {
/* 74 */       if (this.c.O().b("mobGriefing")) {
/* 75 */         this.c.c(2001, i, j - 1, k, aji.b(ajn.c));
/* 76 */         this.c.d(i, j - 1, k, ajn.d, 0, 2);
/*    */       }
/* 78 */       this.b.p();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */