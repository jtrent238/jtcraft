/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bb
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 13 */     return "netstat";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 18 */     return 0;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 23 */     return "commands.players.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 28 */     if ((paramac instanceof yz)) {
/* 29 */       paramac.a(new fq("Command is not available for players"));
/* 30 */       return;
/*    */     }
/*    */     
/* 33 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString[0].length() > 1)) {
/* 34 */       if ("hottest-read".equals(paramArrayOfString[0])) {
/* 35 */         paramac.a(new fq(ej.h.e().toString()));
/* 36 */       } else if ("hottest-write".equals(paramArrayOfString[0])) {
/* 37 */         paramac.a(new fq(ej.h.g().toString()));
/* 38 */       } else if ("most-read".equals(paramArrayOfString[0])) {
/* 39 */         paramac.a(new fq(ej.h.f().toString()));
/* 40 */       } else if ("most-write".equals(paramArrayOfString[0])) {
/* 41 */         paramac.a(new fq(ej.h.h().toString())); } else { ew localew;
/* 42 */         if ("packet-read".equals(paramArrayOfString[0])) {
/* 43 */           if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].length() > 0)) {
/*    */             try {
/* 45 */               int i = Integer.parseInt(paramArrayOfString[1].trim());
/* 46 */               localew = ej.h.a(i);
/* 47 */               a(paramac, i, localew);
/*    */             } catch (Exception localException1) {
/* 49 */               paramac.a(new fq("Packet " + paramArrayOfString[1] + " not found!"));
/*    */             }
/*    */           } else {
/* 52 */             paramac.a(new fq("Packet id is missing"));
/*    */           }
/* 54 */         } else if ("packet-write".equals(paramArrayOfString[0])) {
/* 55 */           if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].length() > 0)) {
/*    */             try {
/* 57 */               int j = Integer.parseInt(paramArrayOfString[1].trim());
/* 58 */               localew = ej.h.b(j);
/* 59 */               a(paramac, j, localew);
/*    */             } catch (Exception localException2) {
/* 61 */               paramac.a(new fq("Packet " + paramArrayOfString[1] + " not found!"));
/*    */             }
/*    */           } else {
/* 64 */             paramac.a(new fq("Packet id is missing"));
/*    */           }
/* 66 */         } else if ("read-count".equals(paramArrayOfString[0])) {
/* 67 */           paramac.a(new fq("total-read-count" + String.valueOf(ej.h.c())));
/* 68 */         } else if ("write-count".equals(paramArrayOfString[0])) {
/* 69 */           paramac.a(new fq("total-write-count" + String.valueOf(ej.h.d())));
/*    */         } else
/* 71 */           paramac.a(new fq("Unrecognized: " + paramArrayOfString[0]));
/*    */       }
/*    */     } else {
/* 74 */       String str = "reads: " + ej.h.a();
/* 75 */       str = str + ", writes: " + ej.h.b();
/* 76 */       paramac.a(new fq(str));
/*    */     }
/*    */   }
/*    */   
/*    */   private void a(ac paramac, int paramInt, ew paramew) {
/* 81 */     if (paramew != null) {
/* 82 */       paramac.a(new fq(paramew.toString()));
/*    */     } else {
/* 84 */       paramac.a(new fq("Packet " + paramInt + " not found!"));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */