/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aax
/*    */   extends aay
/*    */ {
/*    */   private final rb a;
/*    */   private yz b;
/*    */   private int c;
/*    */   
/*    */   public aax(yz paramyz, rb paramrb1, rb paramrb2, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     super(paramrb2, paramInt1, paramInt2, paramInt3);
/* 16 */     this.b = paramyz;
/* 17 */     this.a = paramrb1;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd)
/*    */   {
/* 22 */     return false;
/*    */   }
/*    */   
/*    */   public add a(int paramInt)
/*    */   {
/* 27 */     if (e()) {
/* 28 */       this.c += Math.min(paramInt, d().b);
/*    */     }
/* 30 */     return super.a(paramInt);
/*    */   }
/*    */   
/*    */   protected void a(add paramadd, int paramInt)
/*    */   {
/* 35 */     this.c += paramInt;
/* 36 */     b(paramadd);
/*    */   }
/*    */   
/*    */   protected void b(add paramadd)
/*    */   {
/* 41 */     paramadd.a(this.b.o, this.b, this.c);
/* 42 */     this.c = 0;
/*    */     
/* 44 */     if (paramadd.b() == adb.a(ajn.ai)) this.b.a(pc.h, 1);
/* 45 */     if ((paramadd.b() instanceof adn)) this.b.a(pc.i, 1);
/* 46 */     if (paramadd.b() == adb.a(ajn.al)) this.b.a(pc.j, 1);
/* 47 */     if ((paramadd.b() instanceof ada)) this.b.a(pc.l, 1);
/* 48 */     if (paramadd.b() == ade.P) this.b.a(pc.m, 1);
/* 49 */     if (paramadd.b() == ade.aU) this.b.a(pc.n, 1);
/* 50 */     if (((paramadd.b() instanceof adn)) && (((adn)paramadd.b()).i() != adc.a)) this.b.a(pc.o, 1);
/* 51 */     if ((paramadd.b() instanceof aeh)) this.b.a(pc.r, 1);
/* 52 */     if (paramadd.b() == adb.a(ajn.bn)) this.b.a(pc.E, 1);
/* 53 */     if (paramadd.b() == adb.a(ajn.X)) this.b.a(pc.G, 1);
/*    */   }
/*    */   
/*    */   public void a(yz paramyz, add paramadd)
/*    */   {
/* 58 */     b(paramadd);
/*    */     
/* 60 */     for (int i = 0; i < this.a.a(); i++) {
/* 61 */       add localadd1 = this.a.a(i);
/* 62 */       if (localadd1 != null) {
/* 63 */         this.a.a(i, 1);
/*    */         
/* 65 */         if (localadd1.b().u()) {
/* 66 */           add localadd2 = new add(localadd1.b().t());
/*    */           
/*    */ 
/* 69 */           if ((!localadd1.b().l(localadd1)) || (!this.b.bm.a(localadd2)))
/*    */           {
/*    */ 
/*    */ 
/*    */ 
/* 74 */             if (this.a.a(i) == null) {
/* 75 */               this.a.a(i, localadd2);
/*    */             }
/*    */             else {
/* 78 */               this.b.a(localadd2, false);
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */