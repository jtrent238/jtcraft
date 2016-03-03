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
/*    */ 
/*    */ 
/*    */ public class akq
/*    */   extends akm
/*    */ {
/* 16 */   private final cp P = new cm();
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 20 */     this.L = paramrg.a("furnace_side");
/* 21 */     this.M = paramrg.a("furnace_top");
/* 22 */     this.N = paramrg.a(N() + "_front_horizontal");
/* 23 */     this.O = paramrg.a(N() + "_front_vertical");
/*    */   }
/*    */   
/*    */   protected cp a(add paramadd)
/*    */   {
/* 28 */     return this.P;
/*    */   }
/*    */   
/*    */   public aor a(ahb paramahb, int paramInt)
/*    */   {
/* 33 */     return new apc();
/*    */   }
/*    */   
/*    */   protected void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 38 */     cl localcl = new cl(paramahb, paramInt1, paramInt2, paramInt3);
/* 39 */     apb localapb = (apb)localcl.j();
/* 40 */     if (localapb == null) { return;
/*    */     }
/* 42 */     int i = localapb.i();
/* 43 */     if (i < 0) {
/* 44 */       paramahb.c(1001, paramInt1, paramInt2, paramInt3, 0);
/*    */     } else {
/* 46 */       add localadd1 = localapb.a(i);
/* 47 */       int j = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7;
/* 48 */       rb localrb = api.b(paramahb, paramInt1 + q.b[j], paramInt2 + q.c[j], paramInt3 + q.d[j]);
/*    */       
/*    */       add localadd2;
/* 51 */       if (localrb != null) {
/* 52 */         localadd2 = api.a(localrb, localadd1.m().a(1), q.a[j]);
/*    */         
/* 54 */         if (localadd2 == null) {
/* 55 */           localadd2 = localadd1.m();
/* 56 */           if (--localadd2.b == 0) localadd2 = null;
/*    */         }
/*    */         else
/*    */         {
/* 60 */           localadd2 = localadd1.m();
/*    */         }
/*    */       } else {
/* 63 */         localadd2 = this.P.a(localcl, localadd1);
/* 64 */         if ((localadd2 != null) && (localadd2.b == 0)) { localadd2 = null;
/*    */         }
/*    */       }
/* 67 */       localapb.a(i, localadd2);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */