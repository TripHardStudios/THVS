package com.google.android.gms.samples.vision.face.multitracker;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.android.gms.vision.face.Landmark;


public class Recognition {
    volatile Face mFace ;
    Landmark landmark;
    static final int mL0 = Landmark.BOTTOM_MOUTH;
    static final int mL1 = Landmark.LEFT_CHEEK;
    static final int mL2 = Landmark.LEFT_EAR_TIP;
    static final int mL3 = Landmark.LEFT_EAR;
    static final int mL4 = Landmark.LEFT_EYE;
    static final int mL5 = Landmark.LEFT_MOUTH;
    static final int mL6 = Landmark.NOSE_BASE;
    static final int mL7 = Landmark.RIGHT_CHEEK;
    static final int mL8 = Landmark.RIGHT_EAR_TIP;
    static final int mL9 = Landmark.RIGHT_EAR;
    static final int mL10 = Landmark.RIGHT_EYE;
    static final int mL11 = Landmark.RIGHT_MOUTH;

    public Recognition(){

        if(mFace.getEulerY() <= -36) {

            for (Landmark landmark : mFace.getLandmarks()) {

                switch (landmark.getType()) {

                    case mL0:
                        float x0 = landmark.getPosition().x;
                        float y0 = landmark.getPosition().y;
                            break;
                    case mL1:
                        float x1 = landmark.getPosition().x;
                        float y1 = landmark.getPosition().y;
                            break;
                    case mL2:
                        float x2 = landmark.getPosition().x;
                        float y2 = landmark.getPosition().y;
                            break;
                    case mL3:
                        float x3 = landmark.getPosition().x;
                        float y3 = landmark.getPosition().y;
                            break;
                    case mL4:
                        float x4 = landmark.getPosition().x;
                        float y4 = landmark.getPosition().y;
                            break;
                    case mL5:
                        float x5 = landmark.getPosition().x;
                        float y5 = landmark.getPosition().y;
                            break;
                    case mL6:
                        float x6 = landmark.getPosition().x;
                        float y6 = landmark.getPosition().y;
                            break;
                    case mL7:
                        float x7 = landmark.getPosition().x;
                        float y7 = landmark.getPosition().y;
                            break;
                    case mL8:
                        float x8 = landmark.getPosition().x;
                        float y8 = landmark.getPosition().y;
                            break;
                    case mL9:
                        float x9 = landmark.getPosition().x;
                        float y9 = landmark.getPosition().y;
                            break;
                    case mL10:
                        float x10 = landmark.getPosition().x;
                        float y10 = landmark.getPosition().y;
                            break;
                    case mL11:
                        float x11 = landmark.getPosition().x;
                        float y11 = landmark.getPosition().y;
                            break;






            }

    }
        }
        }





    // public int getItemPosition(long id)
    //{
    //     for (int position=0; position<mList.size(); position++)
    //         if (mList.get(position).getId() == id)
    //             return position;
    //     return 0;
    // }

    // for (int i = 0; i < faces.size(); ++i) {
    //     Face face = faces.valueAt(i);
    //     for (Landmark landmark : face.getLandmarks()) {
    //         switch (landmark.getType()) {
    //             case Landmark.LEFT_EYE:
    // use landmark.getPosition() as the left eye position

    // for(Landmark landmark : face.getLandmarks()){
   //     if(landmark.getType() == Landmark.NOSE_BASE){
   //         Bitmap moustache = BitmapFactory.decodeResource(resources, R.drawable.moustache);
   //         canvas.drawText("=====", landmark.getPosition().x, landmark.getPosition().y, mIdPaint);
   //     }
   // }

    public Landmark getLSideLandmark() {
        Paint mLandmarkPaint = new Paint();
        Canvas canvas = null;
        float eulerY = mFace.getEulerY();
        float eulerZ = mFace.getEulerZ();
       //TODO: If eulerY is x position get landmarks and positions


        if (eulerY <= -36){

            mFace.getPosition();
            mFace.getLandmarks();
            int type= landmark.getType();
            float x1 = 0, x3 = 0,x4 = 0,x5 = 0,x6 = 0;
            float y1 = 0, y3 = 0, y4 = 0, y5 = 0, y6 = 0;

            if (type == 1){
                 x1 = landmark.getPosition().x;
                 y1 = landmark.getPosition().y;

            }

            if (type == 3){
                x3 = landmark.getPosition().x;
                y3 = landmark.getPosition().y;
            }

            if (type == 4){
                 x4 = landmark.getPosition().x;
                 y4 = landmark.getPosition().y;
            }

            if (type == 5){
                x5 = landmark.getPosition().x;
                y5 = landmark.getPosition().y;
            }

            if (type == 6){
                x6 = landmark.getPosition().x;
                y6 = landmark.getPosition().y;

            }
            float dist = ((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3));

            float aAx = x1 - x3; float aAy = y1 - y3;
            float bAx = x1 - x4; float bAy = y1 - y4;
            float cAx = x1 - x5; float cAy = y1 - y5;
            float dAx = x1 - x6; float dAy = y1 - y6;
            float aBx = x3 - x4; float aBy = y3 - y4;
            float bBx = x3 - x5; float bBy = y3 - y5;
            float cBx = x3 - x6; float cBy = y3 - y6;
            float aCx = x4 - x5; float aCy = y4 - y5;
            float bCx = x4 - x6; float bCy = y4 - y6;
            float cCx = x5 - x6; float cCy = y5 - y6;

            float distAA = (aAx*aAx)+(aAy*aAy);
          //  canvas.drawLine(x1,y1,x3,y3,mLandmarkPaint);
            float distBA = (bAx*bAx)+(bAy*bAy);
            float distCA = (cAx*cAx)+(cAy*cAy);
            float distDA = (dAx*dAx)+(dAy*dAy);
            float distAB = (aBx*aBx)+(aBy*aBy);
            float distBB = (bBx*bBx)+(bBy*bBy);
            float distCB = (cBx*cBx)+(cBy*cBy);
            float distAC = (aCx*aCx)+(aCy*aCy);
            float distBC = (bCx*bCx)+(bCy*bCy);
            float distCC = (cCx*cCx)+(cCy*cCy);

            if (eulerY >= -36 && eulerY <= -12){
                mFace.getPosition();
                mFace.getLandmarks();
                float x0 = 0, x2 = 0, x10 = 0;
                float y0 = 0, y2 = 0, y10 = 0;

                if (type == 0){
                    x0 = landmark.getPosition().x;
                    y0 = landmark.getPosition().y;

                }

                if (type == 1){
                    x1 = landmark.getPosition().x;
                    y1 = landmark.getPosition().y;
                }
                if (type == 2){
                    x2 = landmark.getPosition().x;
                    y2 = landmark.getPosition().y;
                }
                if (type == 4){
                    x4 = landmark.getPosition().x;
                    y4 = landmark.getPosition().y;
                }

                if (type == 5){
                    x5 = landmark.getPosition().x;
                    y5 = landmark.getPosition().y;
                }

                if (type == 6){
                    x6 = landmark.getPosition().x;
                    y6 = landmark.getPosition().y;


                }
                if (type == 10){
                    x10 = landmark.getPosition().x;
                    y10 = landmark.getPosition().y;
                }
                //float dist = ((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3));

                float eAx = x0 - x1; float eAy = y0 - y1;
                float fAx = x0 - x2; float fAy = y0 - y2;
                float gAx = x0 - x4; float gAy = y0 - y4;
                float hAx = x0 - x5; float hAy = y0 - y5;
                float iAx = x0 - x6; float iAy = y0 - y6;
                float jAx = x0 - x10; float jAy = y0 - y10;
                float eBx = x1 - x2; float eBy = y1 - y2;
                float fBx = x1 - x4; float fBy = y1 - y4;
                float gBx = x1 - x5; float gBy = y1 - y5;
                float hBx = x1 - x6; float hBy = y1 - y6;
                float iBx = x1 - x10; float iBy = y1 - y10;
                float jBx = x6 - x10; float jBy = y6 - y10;
                float eCx = x2 - x4; float eCy = y2 - y4;
                float fCx = x2 - x5; float fCy = y2 - y5;
                float gCx = x2 - x6; float gCy = y2 - y6;
                float hCx = x2 - x10; float hCy = y2 - y10;
                float iCx = x5 - x6; float iCy = y5 - y6;
                float jCx = x5 - x10; float jCy = y5 - y10;
                float eDx = x4 - x5; float eDy = y4 -y5;
                float fDx = x4 - x6; float fDy = y4 - y6;
                float gDx = x4 - x10; float gDy = y4 - y10;

                float disteA = (eAx*eAx)+(eAy*eAy);
                //  canvas.drawLine(x1,y1,x3,y3,mLandmarkPaint);
                float distfA = (fAx*fAx)+(fAy*fAy);
                float distgA = (gAx*gAx)+(gAy*gAy);
                float disthA = (hAx*hAx)+(hAy*hAy);
                float distiA = (iAx*iAx)+(iAy*iAy);
                float distjA = (jAx*jAx)+(jAy*jAy);
                float disteB = (eBx*eBx)+(eBy*eBy);
                float distfB = (fBx*fBx)+(fBy*fBy);
                float distgB = (gBx*gBx)+(gBy*gBy);
                float disthB = (hBx*hBx)+(hBy*hBy);
                float distiB = (iBx*iBx)+(iBy*iBy);
                float distjB = (jBx*jBx)+(jBy*jBy);
                float disteC = (eCx*eCx)+(eCy*eCy);
                float distfC = (fCx*fCx)+(fCy*fCy);
                float distgC = (gCx*gCx)+(gCy*gCy);



            }
            if (eulerY <= -12 && eulerY >= 12){
                mFace.getPosition();
                mFace.getLandmarks();
                float x0 = 0, x2 = 0, x10 = 0;
                float y0 = 0, y2 = 0, y10 = 0;

                if (type == 0){
                    x0 = landmark.getPosition().x;
                    y0 = landmark.getPosition().y;

                }

                if (type == 1){
                    x1 = landmark.getPosition().x;
                    y1 = landmark.getPosition().y;
                }
                if (type == 2){
                    x2 = landmark.getPosition().x;
                    y2 = landmark.getPosition().y;
                }
                if (type == 4){
                    x4 = landmark.getPosition().x;
                    y4 = landmark.getPosition().y;
                }

                if (type == 5){
                    x5 = landmark.getPosition().x;
                    y5 = landmark.getPosition().y;
                }

                if (type == 6){
                    x6 = landmark.getPosition().x;
                    y6 = landmark.getPosition().y;


                }
                if (type == 10){
                    x10 = landmark.getPosition().x;
                    y10 = landmark.getPosition().y;
                }
                //float dist = ((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3));

                float eAx = x0 - x1; float eAy = y0 - y1;
                float fAx = x0 - x2; float fAy = y0 - y2;
                float gAx = x0 - x4; float gAy = y0 - y4;
                float hAx = x0 - x5; float hAy = y0 - y5;
                float iAx = x0 - x6; float iAy = y0 - y6;
                float jAx = x0 - x10; float jAy = y0 - y10;
                float eBx = x1 - x2; float eBy = y1 - y2;
                float fBx = x1 - x4; float fBy = y1 - y4;
                float gBx = x1 - x5; float gBy = y1 - y5;
                float hBx = x1 - x6; float hBy = y1 - y6;
                float iBx = x1 - x10; float iBy = y1 - y10;
                float jBx = x6 - x10; float jBy = y6 - y10;
                float eCx = x2 - x4; float eCy = y2 - y4;
                float fCx = x2 - x5; float fCy = y2 - y5;
                float gCx = x2 - x6; float gCy = y2 - y6;
                float hCx = x2 - x10; float hCy = y2 - y10;
                float iCx = x5 - x6; float iCy = y5 - y6;
                float jCx = x5 - x10; float jCy = y5 - y10;
                float eDx = x4 - x5; float eDy = y4 -y5;
                float fDx = x4 - x6; float fDy = y4 - y6;
                float gDx = x4 - x10; float gDy = y4 - y10;

                float disteA = (eAx*eAx)+(eAy*eAy);
                //  canvas.drawLine(x1,y1,x3,y3,mLandmarkPaint);
                float distfA = (fAx*fAx)+(fAy*fAy);
                float distgA = (gAx*gAx)+(gAy*gAy);
                float disthA = (hAx*hAx)+(hAy*hAy);
                float distiA = (iAx*iAx)+(iAy*iAy);
                float distjA = (jAx*jAx)+(jAy*jAy);
                float disteB = (eBx*eBx)+(eBy*eBy);
                float distfB = (fBx*fBx)+(fBy*fBy);
                float distgB = (gBx*gBx)+(gBy*gBy);
                float disthB = (hBx*hBx)+(hBy*hBy);
                float distiB = (iBx*iBx)+(iBy*iBy);
               // float distjB = (jBx*jBx)+(jBy*jBy);
               // float disteC = (eCx*eCx)+(eCy*eCy);
               // float distfC = (fCx*fCx)+(fCy*fCy);
               // float distgC = (gCx*gCx)+(gCy*gCy);

            // dx = x1 - x2;
           // dy = y1 - y2;
            //
           // dist = sqrt (dx*dx + dy*dy);

        }
    }return null;
}}
