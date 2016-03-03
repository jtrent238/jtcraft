/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abj
/*    */   extends adb
/*    */ {
/*    */   public abj()
/*    */   {
/* 15 */     this.h = 1;
/* 16 */     a(abt.e);
/*    */   }
/*    */   
/*    */ 
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 22 */     float f1 = 1.0F;
/*    */     
/* 24 */     float f2 = paramyz.B + (paramyz.z - paramyz.B) * f1;
/* 25 */     float f3 = paramyz.A + (paramyz.y - paramyz.A) * f1;
/*    */     
/* 27 */     double d1 = paramyz.p + (paramyz.s - paramyz.p) * f1;
/* 28 */     double d2 = paramyz.q + (paramyz.t - paramyz.q) * f1 + 1.62D - paramyz.L;
/* 29 */     double d3 = paramyz.r + (paramyz.u - paramyz.r) * f1;
/*    */     
/* 31 */     azw localazw1 = azw.a(d1, d2, d3);
/*    */     
/* 33 */     float f4 = qh.b(-f3 * 0.017453292F - 3.1415927F);
/* 34 */     float f5 = qh.a(-f3 * 0.017453292F - 3.1415927F);
/* 35 */     float f6 = -qh.b(-f2 * 0.017453292F);
/* 36 */     float f7 = qh.a(-f2 * 0.017453292F);
/*    */     
/* 38 */     float f8 = f5 * f6;
/* 39 */     float f9 = f7;
/* 40 */     float f10 = f4 * f6;
/*    */     
/* 42 */     double d4 = 5.0D;
/* 43 */     azw localazw2 = localazw1.c(f8 * d4, f9 * d4, f10 * d4);
/* 44 */     azu localazu = paramahb.a(localazw1, localazw2, true);
/* 45 */     if (localazu == null) { return paramadd;
/*    */     }
/*    */     
/* 48 */     azw localazw3 = paramyz.j(f1);
/* 49 */     int i = 0;
/* 50 */     float f11 = 1.0F;
/* 51 */     List localList = paramahb.b(paramyz, paramyz.C.a(localazw3.a * d4, localazw3.b * d4, localazw3.c * d4).b(f11, f11, f11));
/* 52 */     Object localObject; for (int j = 0; j < localList.size(); j++) {
/* 53 */       sa localsa = (sa)localList.get(j);
/* 54 */       if (localsa.R())
/*    */       {
/* 56 */         float f12 = localsa.af();
/* 57 */         localObject = localsa.C.b(f12, f12, f12);
/* 58 */         if (((azt)localObject).a(localazw1))
/* 59 */           i = 1;
/*    */       }
/*    */     }
/* 62 */     if (i != 0) {
/* 63 */       return paramadd;
/*    */     }
/*    */     
/* 66 */     if (localazu.a == azv.b) {
/* 67 */       j = localazu.b;
/* 68 */       int k = localazu.c;
/* 69 */       int m = localazu.d;
/*    */       
/* 71 */       if (paramahb.a(j, k, m) == ajn.aC) { k--;
/*    */       }
/* 73 */       localObject = new xi(paramahb, j + 0.5F, k + 1.0F, m + 0.5F);
/* 74 */       ((xi)localObject).y = (((qh.c(paramyz.y * 4.0F / 360.0F + 0.5D) & 0x3) - 1) * 90);
/* 75 */       if (!paramahb.a((sa)localObject, ((xi)localObject).C.b(-0.1D, -0.1D, -0.1D)).isEmpty()) {
/* 76 */         return paramadd;
/*    */       }
/* 78 */       if (!paramahb.E) {
/* 79 */         paramahb.d((sa)localObject);
/*    */       }
/* 81 */       if (!paramyz.bE.d) {
/* 82 */         paramadd.b -= 1;
/*    */       }
/*    */     }
/*    */     
/* 86 */     return paramadd;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */